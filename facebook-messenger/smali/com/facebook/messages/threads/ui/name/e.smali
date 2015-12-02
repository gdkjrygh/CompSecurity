.class public Lcom/facebook/messages/threads/ui/name/e;
.super Ljava/lang/Object;
.source "ThreadNameViewComputer.java"

# interfaces
.implements Lcom/facebook/widget/text/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/widget/text/l",
        "<",
        "Lcom/facebook/messages/threads/ui/name/g;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/res/Resources;

.field private final b:Lcom/facebook/messages/threads/ui/name/a;

.field private final c:Lcom/facebook/messages/threads/ui/name/d;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/facebook/messages/threads/ui/name/a;Lcom/facebook/messages/threads/ui/name/d;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/facebook/messages/threads/ui/name/e;->a:Landroid/content/res/Resources;

    .line 46
    iput-object p2, p0, Lcom/facebook/messages/threads/ui/name/e;->b:Lcom/facebook/messages/threads/ui/name/a;

    .line 47
    iput-object p3, p0, Lcom/facebook/messages/threads/ui/name/e;->c:Lcom/facebook/messages/threads/ui/name/d;

    .line 48
    return-void
.end method

.method private a(Ljava/util/List;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;)Landroid/text/StaticLayout;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/text/TextPaint;",
            "I",
            "Landroid/text/Layout$Alignment;",
            ")",
            "Landroid/text/StaticLayout;"
        }
    .end annotation

    .prologue
    .line 172
    if-nez p1, :cond_0

    .line 173
    const/4 v0, 0x0

    .line 185
    :goto_0
    return-object v0

    .line 175
    :cond_0
    const/4 v0, 0x1

    .line 176
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 178
    if-nez v1, :cond_1

    .line 179
    const-string v1, "\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    :cond_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    const/4 v0, 0x0

    move v1, v0

    goto :goto_1

    .line 184
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 185
    new-instance v0, Landroid/text/StaticLayout;

    const/4 v2, 0x0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v5, 0x4000

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/4 v9, 0x1

    sget-object v10, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    move-object v4, p2

    move-object/from16 v6, p4

    move v11, p3

    invoke-direct/range {v0 .. v11}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZLandroid/text/TextUtils$TruncateAt;I)V

    goto :goto_0
.end method

.method private a(Landroid/text/TextPaint;Ljava/lang/String;I)Lcom/facebook/messages/threads/ui/name/f;
    .locals 2

    .prologue
    .line 191
    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    .line 192
    int-to-float v1, p3

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 193
    new-instance v0, Lcom/facebook/messages/threads/ui/name/f;

    invoke-static {p2}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/facebook/messages/threads/ui/name/f;-><init>(Landroid/text/TextPaint;Ljava/util/List;)V

    .line 195
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Ljava/util/List;Ljava/util/List;III)Lcom/facebook/messages/threads/ui/name/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/text/TextPaint;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;III)",
            "Lcom/facebook/messages/threads/ui/name/f;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x2

    .line 112
    invoke-direct {p0, p2}, Lcom/facebook/messages/threads/ui/name/e;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 115
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    .line 116
    invoke-direct {p0, v0, v1, p3}, Lcom/facebook/messages/threads/ui/name/e;->a(Landroid/text/TextPaint;Ljava/lang/String;I)Lcom/facebook/messages/threads/ui/name/f;

    move-result-object v0

    .line 117
    if-eqz v0, :cond_0

    .line 155
    :goto_0
    return-object v0

    .line 122
    :cond_1
    if-gez p5, :cond_4

    .line 123
    const v4, 0x7fffffff

    .line 127
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/text/TextPaint;

    .line 128
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    .line 129
    if-ge v0, v3, :cond_2

    .line 130
    new-instance v0, Lcom/facebook/messages/threads/ui/name/f;

    invoke-static {v1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, v5, v1}, Lcom/facebook/messages/threads/ui/name/f;-><init>(Landroid/text/TextPaint;Ljava/util/List;)V

    goto :goto_0

    .line 135
    :cond_2
    const/4 v0, 0x3

    new-array v6, v0, [I

    .line 136
    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-direct {p0, v1}, Lcom/facebook/messages/threads/ui/name/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v1

    float-to-int v1, v1

    aput v1, v6, v0

    .line 137
    const/4 v0, 0x1

    const/16 v1, 0x58

    invoke-direct {p0, v1}, Lcom/facebook/messages/threads/ui/name/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v1

    float-to-int v1, v1

    aput v1, v6, v0

    .line 138
    const/16 v0, 0x378

    invoke-direct {p0, v0}, Lcom/facebook/messages/threads/ui/name/e;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    aput v0, v6, v3

    .line 140
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/e;->b:Lcom/facebook/messages/threads/ui/name/a;

    move-object v1, p2

    move v2, p3

    move v3, p4

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/messages/threads/ui/name/a;->a(Ljava/util/List;IIILandroid/text/TextPaint;[I)Lcom/facebook/messages/threads/ui/name/c;

    move-result-object v1

    .line 148
    invoke-virtual {v1}, Lcom/facebook/messages/threads/ui/name/c;->a()Ljava/util/List;

    move-result-object v2

    .line 149
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    .line 150
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_3

    invoke-virtual {v1}, Lcom/facebook/messages/threads/ui/name/c;->b()I

    move-result v3

    if-lez v3, :cond_3

    .line 151
    add-int/lit8 v3, v0, -0x1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Lcom/facebook/messages/threads/ui/name/c;->b()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/facebook/messages/threads/ui/name/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 155
    :cond_3
    new-instance v0, Lcom/facebook/messages/threads/ui/name/f;

    invoke-direct {v0, v5, v2}, Lcom/facebook/messages/threads/ui/name/f;-><init>(Landroid/text/TextPaint;Ljava/util/List;)V

    goto/16 :goto_0

    :cond_4
    move v4, p5

    goto/16 :goto_1
.end method

.method private a(I)Ljava/lang/String;
    .locals 6

    .prologue
    .line 207
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/messages/threads/ui/name/e;->a:Landroid/content/res/Resources;

    sget v2, Lcom/facebook/o;->thread_name_n_more:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 199
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 200
    const-string v0, ", "

    invoke-static {v0}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 202
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/messages/threads/ui/name/e;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->thread_name_with_only_you:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/messages/threads/ui/name/g;Ljava/util/List;ILandroid/text/Layout$Alignment;II)Landroid/text/Layout;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/threads/ui/name/g;",
            "Ljava/util/List",
            "<",
            "Landroid/text/TextPaint;",
            ">;I",
            "Landroid/text/Layout$Alignment;",
            "II)",
            "Landroid/text/Layout;"
        }
    .end annotation

    .prologue
    .line 68
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    .line 69
    if-nez p1, :cond_0

    .line 71
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {p0, v1, v0, p3, p4}, Lcom/facebook/messages/threads/ui/name/e;->a(Ljava/util/List;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;)Landroid/text/StaticLayout;

    move-result-object v0

    .line 87
    :goto_0
    return-object v0

    .line 72
    :cond_0
    iget-object v1, p0, Lcom/facebook/messages/threads/ui/name/e;->c:Lcom/facebook/messages/threads/ui/name/d;

    sget-object v2, Lcom/facebook/messages/threads/ui/name/d;->USE_THREAD_NAME_IF_AVAILABLE:Lcom/facebook/messages/threads/ui/name/d;

    if-ne v1, v2, :cond_1

    invoke-virtual {p1}, Lcom/facebook/messages/threads/ui/name/g;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 75
    invoke-virtual {p1}, Lcom/facebook/messages/threads/ui/name/g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v1

    .line 76
    invoke-direct {p0, v1, v0, p3, p4}, Lcom/facebook/messages/threads/ui/name/e;->a(Ljava/util/List;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;)Landroid/text/StaticLayout;

    move-result-object v0

    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/threads/ui/name/g;->c()Lcom/google/common/a/es;

    move-result-object v2

    move-object v0, p0

    move-object v1, p2

    move v3, p3

    move v4, p5

    move v5, p6

    .line 80
    invoke-direct/range {v0 .. v5}, Lcom/facebook/messages/threads/ui/name/e;->a(Ljava/util/List;Ljava/util/List;III)Lcom/facebook/messages/threads/ui/name/f;

    move-result-object v0

    .line 87
    iget-object v1, v0, Lcom/facebook/messages/threads/ui/name/f;->b:Ljava/util/List;

    iget-object v0, v0, Lcom/facebook/messages/threads/ui/name/f;->a:Landroid/text/TextPaint;

    invoke-direct {p0, v1, v0, p3, p4}, Lcom/facebook/messages/threads/ui/name/e;->a(Ljava/util/List;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;)Landroid/text/StaticLayout;

    move-result-object v0

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/util/List;ILandroid/text/Layout$Alignment;II)Landroid/text/Layout;
    .locals 7

    .prologue
    .line 22
    move-object v1, p1

    check-cast v1, Lcom/facebook/messages/threads/ui/name/g;

    move-object v0, p0

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/messages/threads/ui/name/e;->a(Lcom/facebook/messages/threads/ui/name/g;Ljava/util/List;ILandroid/text/Layout$Alignment;II)Landroid/text/Layout;

    move-result-object v0

    return-object v0
.end method

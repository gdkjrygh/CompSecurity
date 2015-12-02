.class Lcom/facebook/widget/text/h;
.super Ljava/lang/Object;
.source "SimpleVariableTextLayoutView.java"

# interfaces
.implements Lcom/facebook/widget/text/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/widget/text/l",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/widget/text/g;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0}, Lcom/facebook/widget/text/h;-><init>()V

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
    .line 133
    if-nez p1, :cond_0

    .line 134
    const/4 v0, 0x0

    .line 146
    :goto_0
    return-object v0

    .line 136
    :cond_0
    const/4 v0, 0x1

    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
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

    .line 139
    if-nez v1, :cond_1

    .line 140
    const-string v1, "\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    :cond_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    const/4 v0, 0x0

    move v1, v0

    goto :goto_1

    .line 145
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 146
    new-instance v0, Landroid/text/StaticLayout;

    const/4 v2, 0x0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v5, 0x4000

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    move-object v4, p2

    move-object/from16 v6, p4

    move v11, p3

    invoke-direct/range {v0 .. v11}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZLandroid/text/TextUtils$TruncateAt;I)V

    goto :goto_0
.end method

.method private a(Ljava/util/List;Ljava/lang/String;III)Lcom/facebook/widget/text/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/text/TextPaint;",
            ">;",
            "Ljava/lang/String;",
            "III)",
            "Lcom/facebook/widget/text/i;"
        }
    .end annotation

    .prologue
    .line 110
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    .line 111
    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/widget/text/h;->a(Landroid/text/TextPaint;Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 112
    new-instance v1, Lcom/facebook/widget/text/i;

    invoke-static {p2}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/facebook/widget/text/i;-><init>(Landroid/text/TextPaint;Ljava/util/List;)V

    move-object v0, v1

    .line 116
    :goto_0
    return-object v0

    :cond_1
    new-instance v1, Lcom/facebook/widget/text/i;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    invoke-static {p2}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/facebook/widget/text/i;-><init>(Landroid/text/TextPaint;Ljava/util/List;)V

    move-object v0, v1

    goto :goto_0
.end method

.method private a(Landroid/text/TextPaint;Ljava/lang/String;I)Z
    .locals 2

    .prologue
    .line 152
    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    .line 153
    int-to-float v1, p3

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/util/List;ILandroid/text/Layout$Alignment;II)Landroid/text/Layout;
    .locals 7

    .prologue
    .line 67
    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    move-object v0, p0

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/widget/text/h;->a(Ljava/lang/String;Ljava/util/List;ILandroid/text/Layout$Alignment;II)Landroid/text/Layout;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/util/List;ILandroid/text/Layout$Alignment;II)Landroid/text/Layout;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
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
    const/4 v0, 0x1

    .line 77
    if-ne p5, v0, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p1

    move v3, p3

    move v4, p5

    move v5, p6

    .line 78
    invoke-direct/range {v0 .. v5}, Lcom/facebook/widget/text/h;->a(Ljava/util/List;Ljava/lang/String;III)Lcom/facebook/widget/text/i;

    move-result-object v0

    .line 85
    iget-object v1, v0, Lcom/facebook/widget/text/i;->b:Ljava/util/List;

    iget-object v0, v0, Lcom/facebook/widget/text/i;->a:Landroid/text/TextPaint;

    invoke-direct {p0, v1, v0, p3, p4}, Lcom/facebook/widget/text/h;->a(Ljava/util/List;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;)Landroid/text/StaticLayout;

    move-result-object v0

    return-object v0

    .line 77
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

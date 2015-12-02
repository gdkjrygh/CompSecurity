.class public Lcom/facebook/orca/common/ui/widgets/text/f;
.super Ljava/lang/Object;
.source "RowReceiptTextViewComputer.java"

# interfaces
.implements Lcom/facebook/widget/text/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/widget/text/l",
        "<",
        "Lcom/facebook/orca/common/ui/widgets/text/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/orca/f/k;

.field private final d:Lcom/facebook/messages/threads/ui/name/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/orca/common/ui/widgets/text/f;

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/text/f;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/f/k;Lcom/facebook/messages/threads/ui/name/a;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/facebook/orca/common/ui/widgets/text/f;->b:Landroid/content/Context;

    .line 42
    iput-object p2, p0, Lcom/facebook/orca/common/ui/widgets/text/f;->c:Lcom/facebook/orca/f/k;

    .line 43
    iput-object p3, p0, Lcom/facebook/orca/common/ui/widgets/text/f;->d:Lcom/facebook/messages/threads/ui/name/a;

    .line 44
    return-void
.end method

.method private a(Ljava/lang/String;Landroid/text/Layout$Alignment;ILandroid/text/TextPaint;)Landroid/text/Layout;
    .locals 12

    .prologue
    .line 150
    new-instance v0, Landroid/text/StaticLayout;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v5, 0x4000

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    move-object v1, p1

    move-object/from16 v4, p4

    move-object v6, p2

    move v11, p3

    invoke-direct/range {v0 .. v11}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZLandroid/text/TextUtils$TruncateAt;I)V

    return-object v0
.end method

.method private a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 165
    if-lez p2, :cond_0

    .line 166
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/f;->b:Landroid/content/Context;

    sget v1, Lcom/facebook/o;->message_seen_receipt_group_multiple_more:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 171
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/f;->b:Landroid/content/Context;

    sget v1, Lcom/facebook/o;->message_seen_receipt_group_multiple:I

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 176
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 177
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    .line 178
    iget-object v3, p0, Lcom/facebook/orca/common/ui/widgets/text/f;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/f/k;->b(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 181
    :cond_0
    return-object v1
.end method

.method private a(Lcom/facebook/orca/common/ui/widgets/text/e;)V
    .locals 4

    .prologue
    const/16 v3, 0xa

    .line 131
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0xc8

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 132
    const-string v0, "RowReceiptTextView.Data\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/widgets/text/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 134
    const-string v0, "getSimpleText "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/widgets/text/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 136
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/widgets/text/e;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 137
    const-string v0, "getRowReceiptParticipantList\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/widgets/text/e;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    .line 139
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 142
    :cond_1
    sget-object v0, Lcom/facebook/orca/common/ui/widgets/text/f;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 143
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/common/ui/widgets/text/e;Ljava/util/List;ILandroid/text/Layout$Alignment;II)Landroid/text/Layout;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/common/ui/widgets/text/e;",
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
    .line 67
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Since only one textPaint is picked, it should only include one"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 70
    const/4 v0, 0x1

    if-ne p5, v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    const-string v1, "Only one line is laid out by this logic."

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 72
    if-nez p1, :cond_2

    .line 73
    const-string v1, ""

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    invoke-direct {p0, v1, p4, p3, v0}, Lcom/facebook/orca/common/ui/widgets/text/f;->a(Ljava/lang/String;Landroid/text/Layout$Alignment;ILandroid/text/TextPaint;)Landroid/text/Layout;

    move-result-object v0

    .line 127
    :goto_2
    return-object v0

    .line 67
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 70
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 76
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/widgets/text/e;->b()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/widgets/text/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 78
    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/widgets/text/e;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    invoke-direct {p0, v1, p4, p3, v0}, Lcom/facebook/orca/common/ui/widgets/text/f;->a(Ljava/lang/String;Landroid/text/Layout$Alignment;ILandroid/text/TextPaint;)Landroid/text/Layout;

    move-result-object v0

    goto :goto_2

    .line 79
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/widgets/text/e;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/widgets/text/e;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 82
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/text/f;->b:Landroid/content/Context;

    sget v2, Lcom/facebook/o;->message_seen_receipt_group_multiple:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, ""

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v2, v0

    .line 87
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/text/f;->b:Landroid/content/Context;

    sget v3, Lcom/facebook/o;->message_seen_receipt_group_multiple_more:I

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, ""

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const/16 v6, 0x8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v1, v0

    .line 91
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    iget-object v3, p0, Lcom/facebook/orca/common/ui/widgets/text/f;->b:Landroid/content/Context;

    sget v4, Lcom/facebook/o;->message_seen_receipt_group_multiple_more:I

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    const-string v7, ""

    aput-object v7, v5, v6

    const/4 v6, 0x1

    const/16 v7, 0x58

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    .line 95
    const/4 v3, 0x2

    new-array v6, v3, [I

    .line 96
    const/4 v3, 0x0

    sub-int/2addr v1, v2

    aput v1, v6, v3

    .line 97
    const/4 v1, 0x1

    sub-int/2addr v0, v2

    aput v0, v6, v1

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/text/f;->d:Lcom/facebook/messages/threads/ui/name/a;

    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/widgets/text/e;->b()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/common/ui/widgets/text/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    sub-int v2, p3, v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/text/TextPaint;

    move v4, p6

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/messages/threads/ui/name/a;->a(Ljava/util/List;IIILandroid/text/TextPaint;[I)Lcom/facebook/messages/threads/ui/name/c;

    move-result-object v1

    .line 109
    invoke-virtual {v1}, Lcom/facebook/messages/threads/ui/name/c;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 110
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/widgets/text/f;->a(Lcom/facebook/orca/common/ui/widgets/text/e;)V

    .line 111
    const-string v0, ""

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/common/ui/widgets/text/f;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    invoke-direct {p0, v1, p4, p3, v0}, Lcom/facebook/orca/common/ui/widgets/text/f;->a(Ljava/lang/String;Landroid/text/Layout$Alignment;ILandroid/text/TextPaint;)Landroid/text/Layout;

    move-result-object v0

    goto/16 :goto_2

    .line 118
    :cond_4
    invoke-virtual {v1}, Lcom/facebook/messages/threads/ui/name/c;->a()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/ui/name/c;->b()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/common/ui/widgets/text/f;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    invoke-direct {p0, v1, p4, p3, v0}, Lcom/facebook/orca/common/ui/widgets/text/f;->a(Ljava/lang/String;Landroid/text/Layout$Alignment;ILandroid/text/TextPaint;)Landroid/text/Layout;

    move-result-object v0

    goto/16 :goto_2

    .line 126
    :cond_5
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/widgets/text/f;->a(Lcom/facebook/orca/common/ui/widgets/text/e;)V

    .line 127
    const-string v1, ""

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/TextPaint;

    invoke-direct {p0, v1, p4, p3, v0}, Lcom/facebook/orca/common/ui/widgets/text/f;->a(Ljava/lang/String;Landroid/text/Layout$Alignment;ILandroid/text/TextPaint;)Landroid/text/Layout;

    move-result-object v0

    goto/16 :goto_2
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/util/List;ILandroid/text/Layout$Alignment;II)Landroid/text/Layout;
    .locals 7

    .prologue
    .line 27
    move-object v1, p1

    check-cast v1, Lcom/facebook/orca/common/ui/widgets/text/e;

    move-object v0, p0

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/orca/common/ui/widgets/text/f;->a(Lcom/facebook/orca/common/ui/widgets/text/e;Ljava/util/List;ILandroid/text/Layout$Alignment;II)Landroid/text/Layout;

    move-result-object v0

    return-object v0
.end method

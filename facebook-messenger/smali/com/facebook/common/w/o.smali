.class public Lcom/facebook/common/w/o;
.super Ljava/lang/Object;
.source "StyledStringBuilder.java"


# instance fields
.field private final a:Landroid/content/res/Resources;

.field private b:Landroid/text/SpannableStringBuilder;

.field private c:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/facebook/common/w/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/w/o;->b:Landroid/text/SpannableStringBuilder;

    .line 35
    invoke-static {}, Lcom/google/common/a/hq;->b()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/w/o;->c:Ljava/util/LinkedList;

    .line 38
    iput-object p1, p0, Lcom/facebook/common/w/o;->a:Landroid/content/res/Resources;

    .line 39
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/w/o;
    .locals 5

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/common/w/o;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 83
    iget-object v0, p0, Lcom/facebook/common/w/o;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/p;

    .line 84
    iget-object v1, p0, Lcom/facebook/common/w/o;->b:Landroid/text/SpannableStringBuilder;

    iget-object v2, v0, Lcom/facebook/common/w/p;->b:Ljava/lang/Object;

    iget v3, v0, Lcom/facebook/common/w/p;->a:I

    iget-object v4, p0, Lcom/facebook/common/w/o;->b:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    iget v0, v0, Lcom/facebook/common/w/p;->c:I

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 85
    return-object p0

    .line 82
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(I)Lcom/facebook/common/w/o;
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/common/w/o;->b:Landroid/text/SpannableStringBuilder;

    iget-object v1, p0, Lcom/facebook/common/w/o;->a:Landroid/content/res/Resources;

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 60
    return-object p0
.end method

.method public a(Ljava/lang/Object;I)Lcom/facebook/common/w/o;
    .locals 3

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/common/w/o;->c:Ljava/util/LinkedList;

    new-instance v1, Lcom/facebook/common/w/p;

    iget-object v2, p0, Lcom/facebook/common/w/o;->b:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    invoke-direct {v1, v2, p1, p2}, Lcom/facebook/common/w/p;-><init>(ILjava/lang/Object;I)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 73
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/common/w/o;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/common/w/o;->b:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 49
    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;
    .locals 3

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/common/w/o;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 102
    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 103
    iget-object v1, p0, Lcom/facebook/common/w/o;->b:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 105
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    .line 106
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v0

    .line 107
    iget-object v2, p0, Lcom/facebook/common/w/o;->b:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v2, v1, v0, p2}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 108
    iget-object v0, p0, Lcom/facebook/common/w/o;->b:Landroid/text/SpannableStringBuilder;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {v0, p3, v1, v2, p4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 110
    :cond_0
    return-object p0
.end method

.method public b()Landroid/text/SpannableString;
    .locals 2

    .prologue
    .line 119
    new-instance v0, Landroid/text/SpannableString;

    iget-object v1, p0, Lcom/facebook/common/w/o;->b:Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method

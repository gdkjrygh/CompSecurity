.class public Lcom/facebook/orca/emoji/z;
.super Ljava/lang/Object;
.source "EmojiUtil.java"


# instance fields
.field private final a:Lcom/facebook/orca/emoji/aa;

.field private final b:Landroid/content/res/Resources;


# direct methods
.method constructor <init>(Lcom/facebook/orca/emoji/aa;Landroid/content/res/Resources;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/orca/emoji/z;->a:Lcom/facebook/orca/emoji/aa;

    .line 25
    iput-object p2, p0, Lcom/facebook/orca/emoji/z;->b:Landroid/content/res/Resources;

    .line 26
    return-void
.end method

.method private a(Lcom/facebook/orca/emoji/c;I)Lcom/facebook/orca/emoji/y;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/emoji/z;->b:Landroid/content/res/Resources;

    invoke-virtual {p1}, Lcom/facebook/orca/emoji/c;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 121
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicWidth()I

    move-result v1

    .line 122
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v2

    .line 124
    iget-object v3, p0, Lcom/facebook/orca/emoji/z;->b:Landroid/content/res/Resources;

    const/high16 v4, 0x41800000    # 16.0f

    invoke-static {v3, v4}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v3

    .line 125
    mul-int/2addr v1, p2

    div-int/2addr v1, v3

    .line 126
    mul-int/2addr v2, p2

    div-int/2addr v2, v3

    .line 128
    invoke-virtual {v0, v5, v5, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(IIII)V

    .line 129
    new-instance v1, Lcom/facebook/orca/emoji/y;

    invoke-direct {v1, v0}, Lcom/facebook/orca/emoji/y;-><init>(Landroid/graphics/drawable/BitmapDrawable;)V

    return-object v1
.end method

.method private a(Landroid/text/Spannable;IIIZ)V
    .locals 8

    .prologue
    const/16 v7, 0x21

    const/4 v6, 0x1

    .line 71
    const/4 v0, -0x1

    if-ne p4, v0, :cond_1

    invoke-interface {p1}, Landroid/text/Spannable;->length()I

    move-result v0

    .line 73
    :goto_0
    if-ge p3, v0, :cond_2

    .line 74
    invoke-static {p1, p3}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v3

    .line 75
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    .line 76
    const/4 v1, 0x0

    .line 77
    add-int v4, p3, v2

    invoke-interface {p1}, Landroid/text/Spannable;->length()I

    move-result v5

    if-ge v4, v5, :cond_0

    .line 78
    add-int v1, p3, v2

    invoke-static {p1, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    .line 80
    :cond_0
    iget-object v4, p0, Lcom/facebook/orca/emoji/z;->a:Lcom/facebook/orca/emoji/aa;

    invoke-virtual {v4, v3, v1}, Lcom/facebook/orca/emoji/aa;->a(II)Lcom/facebook/orca/emoji/c;

    move-result-object v3

    .line 81
    if-eqz v3, :cond_7

    .line 82
    invoke-virtual {v3}, Lcom/facebook/orca/emoji/c;->c()I

    move-result v1

    if-eqz v1, :cond_6

    .line 83
    invoke-virtual {v3}, Lcom/facebook/orca/emoji/c;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    invoke-virtual {v3}, Lcom/facebook/orca/emoji/c;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v1, v2

    .line 87
    :goto_1
    invoke-direct {p0, v3, p2}, Lcom/facebook/orca/emoji/z;->a(Lcom/facebook/orca/emoji/c;I)Lcom/facebook/orca/emoji/y;

    move-result-object v2

    .line 88
    add-int v3, p3, v1

    invoke-interface {p1, v2, p3, v3, v7}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 95
    :goto_2
    add-int/2addr p3, v1

    .line 96
    goto :goto_0

    .line 71
    :cond_1
    add-int v0, p3, p4

    goto :goto_0

    .line 98
    :cond_2
    if-nez p5, :cond_4

    .line 115
    :cond_3
    return-void

    .line 102
    :cond_4
    sget-object v0, Lcom/facebook/orca/emoji/aa;->q:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 103
    :cond_5
    :goto_3
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 104
    iget-object v1, p0, Lcom/facebook/orca/emoji/z;->a:Lcom/facebook/orca/emoji/aa;

    invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/emoji/aa;->a(Ljava/lang/String;)Lcom/facebook/orca/emoji/c;

    move-result-object v1

    .line 105
    if-eqz v1, :cond_5

    .line 106
    invoke-direct {p0, v1, p2}, Lcom/facebook/orca/emoji/z;->a(Lcom/facebook/orca/emoji/c;I)Lcom/facebook/orca/emoji/y;

    move-result-object v1

    .line 107
    invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->start(I)I

    move-result v2

    invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->end(I)I

    move-result v3

    invoke-interface {p1, v1, v2, v3, v7}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_3

    :cond_6
    move v1, v2

    goto :goto_1

    :cond_7
    move v1, v2

    goto :goto_2
.end method


# virtual methods
.method public a(Landroid/text/Spannable;I)V
    .locals 6

    .prologue
    .line 49
    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/emoji/z;->a(Landroid/text/Spannable;IIIZ)V

    .line 50
    return-void
.end method

.method public a(Landroid/text/Spannable;III)V
    .locals 6

    .prologue
    .line 62
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/emoji/z;->a(Landroid/text/Spannable;IIIZ)V

    .line 63
    return-void
.end method

.method public a(Landroid/widget/EditText;Lcom/facebook/orca/emoji/c;)V
    .locals 4

    .prologue
    .line 29
    invoke-virtual {p1}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v0

    .line 30
    invoke-virtual {p1}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v1

    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 33
    invoke-virtual {p2}, Lcom/facebook/orca/emoji/c;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 34
    invoke-virtual {p2}, Lcom/facebook/orca/emoji/c;->c()I

    move-result v3

    if-eqz v3, :cond_0

    .line 35
    invoke-virtual {p2}, Lcom/facebook/orca/emoji/c;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    .line 37
    :cond_0
    invoke-virtual {p1}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v3

    .line 38
    invoke-interface {v3, v0, v1, v2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 39
    return-void
.end method

.class public Lcom/facebook/orca/contacts/picker/p;
.super Ljava/lang/Object;
.source "ContactPickerEditableUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    return-void
.end method

.method private c(Landroid/text/Editable;)[Lcom/facebook/orca/contacts/picker/ce;
    .locals 3

    .prologue
    .line 144
    const/4 v0, 0x0

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v1

    const-class v2, Lcom/facebook/orca/contacts/picker/ce;

    invoke-interface {p1, v0, v1, v2}, Landroid/text/Editable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/contacts/picker/ce;

    .line 148
    new-instance v1, Lcom/facebook/orca/contacts/picker/q;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/contacts/picker/q;-><init>(Lcom/facebook/orca/contacts/picker/p;Landroid/text/Editable;)V

    invoke-static {v0, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 157
    return-object v0
.end method


# virtual methods
.method a(Ljava/lang/CharSequence;)Lcom/facebook/orca/contacts/picker/r;
    .locals 11

    .prologue
    const/4 v4, 0x0

    const/4 v2, 0x0

    .line 39
    instance-of v0, p1, Landroid/text/Spannable;

    if-nez v0, :cond_0

    .line 41
    new-instance v0, Lcom/facebook/orca/contacts/picker/r;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {v0, v2, v1}, Lcom/facebook/orca/contacts/picker/r;-><init>(II)V

    .line 90
    :goto_0
    return-object v0

    :cond_0
    move-object v0, p1

    .line 44
    check-cast v0, Landroid/text/Spannable;

    .line 45
    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v6

    .line 46
    invoke-static {v0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    .line 48
    if-eq v6, v1, :cond_1

    move-object v0, v4

    .line 50
    goto :goto_0

    .line 56
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    .line 57
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v5, Lcom/facebook/orca/contacts/picker/ce;

    invoke-interface {v0, v2, v1, v5}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/facebook/orca/contacts/picker/ce;

    .line 58
    array-length v7, v1

    move v5, v2

    move v10, v3

    move v3, v2

    move v2, v10

    :goto_1
    if-ge v5, v7, :cond_5

    aget-object v8, v1, v5

    .line 59
    invoke-interface {v0, v8}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v9

    .line 60
    invoke-interface {v0, v8}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v8

    .line 61
    if-ge v9, v6, :cond_2

    if-le v8, v6, :cond_2

    move-object v0, v4

    .line 63
    goto :goto_0

    .line 65
    :cond_2
    if-ge v9, v6, :cond_4

    .line 66
    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 58
    :cond_3
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 67
    :cond_4
    if-le v8, v6, :cond_3

    .line 68
    invoke-static {v2, v9}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_2

    .line 73
    :cond_5
    :goto_3
    if-ge v3, v2, :cond_6

    .line 74
    invoke-interface {v0, v3}, Landroid/text/Spannable;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 75
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 82
    :cond_6
    :goto_4
    add-int/lit8 v1, v2, -0x1

    if-ge v3, v1, :cond_7

    .line 83
    add-int/lit8 v1, v2, -0x1

    invoke-interface {v0, v1}, Landroid/text/Spannable;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 84
    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    .line 90
    :cond_7
    new-instance v0, Lcom/facebook/orca/contacts/picker/r;

    invoke-direct {v0, v3, v2}, Lcom/facebook/orca/contacts/picker/r;-><init>(II)V

    goto :goto_0
.end method

.method public a(Landroid/text/Editable;)V
    .locals 8

    .prologue
    .line 114
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/p;->c(Landroid/text/Editable;)[Lcom/facebook/orca/contacts/picker/ce;

    move-result-object v1

    .line 116
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 117
    invoke-interface {p1, v3}, Landroid/text/Editable;->getSpanStart(Ljava/lang/Object;)I

    move-result v4

    .line 118
    invoke-interface {p1, v3}, Landroid/text/Editable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    .line 120
    sub-int v6, v5, v4

    const/4 v7, 0x1

    if-ne v6, v7, :cond_0

    invoke-interface {p1, v4}, Landroid/text/Editable;->charAt(I)C

    move-result v6

    const/16 v7, 0x20

    if-ne v6, v7, :cond_0

    .line 122
    invoke-interface {p1, v3}, Landroid/text/Editable;->removeSpan(Ljava/lang/Object;)V

    .line 123
    const-string v3, ""

    invoke-interface {p1, v4, v5, v3}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 116
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 126
    :cond_1
    return-void
.end method

.method b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    .prologue
    .line 101
    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/picker/p;->a(Ljava/lang/CharSequence;)Lcom/facebook/orca/contacts/picker/r;

    move-result-object v0

    .line 102
    if-nez v0, :cond_0

    .line 103
    const-string v0, ""

    .line 105
    :goto_0
    return-object v0

    :cond_0
    iget v1, v0, Lcom/facebook/orca/contacts/picker/r;->a:I

    iget v0, v0, Lcom/facebook/orca/contacts/picker/r;->b:I

    invoke-interface {p1, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Landroid/text/Editable;)V
    .locals 2

    .prologue
    .line 134
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/p;->c(Landroid/text/Editable;)[Lcom/facebook/orca/contacts/picker/ce;

    move-result-object v0

    .line 135
    array-length v1, v0

    if-nez v1, :cond_0

    .line 136
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 141
    :goto_0
    return-void

    .line 138
    :cond_0
    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Landroid/text/Editable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    .line 139
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-interface {p1, v0, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    goto :goto_0
.end method

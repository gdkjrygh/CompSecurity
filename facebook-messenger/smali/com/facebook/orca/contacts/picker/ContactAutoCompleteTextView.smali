.class public Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;
.super Landroid/widget/AutoCompleteTextView;
.source "ContactAutoCompleteTextView.java"

# interfaces
.implements Lcom/facebook/widget/a/h;


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
.field private b:Lcom/facebook/orca/contacts/picker/p;

.field private c:Lcom/facebook/user/UserWithIdentifier;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;

    sput-object v0, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;)V

    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->a(Landroid/content/Context;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1, p2}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->a(Landroid/content/Context;)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->a(Landroid/content/Context;)V

    .line 47
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 50
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 51
    const-class v1, Lcom/facebook/orca/contacts/picker/p;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/p;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->b:Lcom/facebook/orca/contacts/picker/p;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->c:Lcom/facebook/user/UserWithIdentifier;

    .line 53
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getInputType()I

    move-result v0

    const/high16 v1, 0x80000

    or-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->setInputType(I)V

    .line 54
    return-void
.end method

.method private c(Lcom/facebook/user/UserWithIdentifier;)Ljava/lang/CharSequence;
    .locals 5

    .prologue
    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 152
    new-instance v1, Landroid/text/TextPaint;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 156
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getCurrentTextColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/text/TextPaint;->setColor(I)V

    .line 158
    new-instance v2, Lcom/facebook/orca/contacts/picker/ce;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-direct {v2, p1, v3, v1, v4}, Lcom/facebook/orca/contacts/picker/ce;-><init>(Lcom/facebook/user/UserWithIdentifier;ILandroid/text/TextPaint;Landroid/content/res/Resources;)V

    .line 160
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 161
    const/4 v3, 0x0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v4, 0x21

    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 162
    return-object v1
.end method


# virtual methods
.method public a()V
    .locals 11

    .prologue
    const/4 v1, 0x0

    const/4 v10, -0x1

    .line 166
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getEditableText()Landroid/text/Editable;

    move-result-object v2

    .line 167
    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v0

    const-class v3, Lcom/facebook/orca/contacts/picker/ce;

    invoke-interface {v2, v1, v0, v3}, Landroid/text/Editable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/contacts/picker/ce;

    .line 168
    invoke-static {v2}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v3

    .line 169
    invoke-static {v2}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v4

    .line 170
    array-length v5, v0

    :goto_0
    if-ge v1, v5, :cond_2

    aget-object v6, v0, v1

    .line 171
    invoke-virtual {v6}, Lcom/facebook/orca/contacts/picker/ce;->a()Lcom/facebook/user/UserWithIdentifier;

    move-result-object v7

    invoke-direct {p0, v7}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->c(Lcom/facebook/user/UserWithIdentifier;)Ljava/lang/CharSequence;

    move-result-object v7

    .line 172
    invoke-interface {v2, v6}, Landroid/text/Editable;->getSpanStart(Ljava/lang/Object;)I

    move-result v8

    .line 173
    invoke-interface {v2, v6}, Landroid/text/Editable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v9

    .line 174
    if-eq v8, v10, :cond_0

    if-ne v9, v10, :cond_1

    .line 175
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PickedUser not found in editable"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 179
    :cond_1
    invoke-interface {v2, v6}, Landroid/text/Editable;->removeSpan(Ljava/lang/Object;)V

    .line 180
    invoke-interface {v2, v8, v9, v7}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 170
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 183
    :cond_2
    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v0

    if-gt v4, v0, :cond_3

    .line 184
    invoke-static {v2, v3, v4}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;II)V

    .line 186
    :cond_3
    return-void
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 86
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->onFilterComplete(I)V

    .line 87
    return-void
.end method

.method a(Lcom/facebook/user/UserWithIdentifier;)V
    .locals 6

    .prologue
    .line 110
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getMeasuredWidth()I

    move-result v0

    if-nez v0, :cond_0

    .line 111
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->c:Lcom/facebook/user/UserWithIdentifier;

    .line 124
    :goto_0
    return-void

    .line 115
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->c(Lcom/facebook/user/UserWithIdentifier;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 116
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getEditableText()Landroid/text/Editable;

    move-result-object v1

    .line 117
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->b:Lcom/facebook/orca/contacts/picker/p;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/contacts/picker/p;->a(Ljava/lang/CharSequence;)Lcom/facebook/orca/contacts/picker/r;

    move-result-object v2

    .line 119
    if-eqz v2, :cond_1

    .line 120
    iget v3, v2, Lcom/facebook/orca/contacts/picker/r;->a:I

    iget v4, v2, Lcom/facebook/orca/contacts/picker/r;->b:I

    const-string v5, ""

    invoke-static {v1, v3, v4, v5}, Landroid/text/method/QwertyKeyListener;->markAsReplaced(Landroid/text/Spannable;IILjava/lang/String;)V

    .line 121
    iget v3, v2, Lcom/facebook/orca/contacts/picker/r;->a:I

    iget v2, v2, Lcom/facebook/orca/contacts/picker/r;->b:I

    invoke-interface {v1, v3, v2, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 123
    :cond_1
    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-static {v1, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/widget/a/j;)V
    .locals 0

    .prologue
    .line 91
    return-void
.end method

.method public b(Lcom/facebook/user/UserWithIdentifier;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 127
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getEditableText()Landroid/text/Editable;

    move-result-object v2

    .line 128
    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v0

    const-class v3, Lcom/facebook/orca/contacts/picker/ce;

    invoke-interface {v2, v1, v0, v3}, Landroid/text/Editable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/contacts/picker/ce;

    .line 129
    array-length v3, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v4, v0, v1

    .line 130
    invoke-virtual {v4}, Lcom/facebook/orca/contacts/picker/ce;->a()Lcom/facebook/user/UserWithIdentifier;

    move-result-object v5

    .line 131
    invoke-virtual {v5}, Lcom/facebook/user/UserWithIdentifier;->b()Lcom/facebook/user/UserKey;

    move-result-object v5

    invoke-virtual {p1}, Lcom/facebook/user/UserWithIdentifier;->b()Lcom/facebook/user/UserKey;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/facebook/user/UserKey;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 132
    invoke-interface {v2, v4}, Landroid/text/Editable;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    .line 133
    invoke-interface {v2, v4}, Landroid/text/Editable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v6

    .line 134
    invoke-interface {v2, v4}, Landroid/text/Editable;->removeSpan(Ljava/lang/Object;)V

    .line 135
    const-string v4, ""

    invoke-interface {v2, v5, v6, v4}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 129
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 138
    :cond_1
    return-void
.end method

.method public enoughToFilter()Z
    .locals 2

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->b:Lcom/facebook/orca/contacts/picker/p;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/contacts/picker/p;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 76
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getThreshold()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onSizeChanged(IIII)V
    .locals 2

    .prologue
    .line 95
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/AutoCompleteTextView;->onSizeChanged(IIII)V

    .line 96
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->a()V

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->c:Lcom/facebook/user/UserWithIdentifier;

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->c:Lcom/facebook/user/UserWithIdentifier;

    .line 101
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->c:Lcom/facebook/user/UserWithIdentifier;

    .line 102
    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->a(Lcom/facebook/user/UserWithIdentifier;)V

    .line 104
    :cond_0
    return-void
.end method

.method protected performFiltering(Ljava/lang/CharSequence;I)V
    .locals 2

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->b:Lcom/facebook/orca/contacts/picker/p;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/contacts/picker/p;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 68
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/a/k;

    .line 69
    invoke-interface {v0}, Lcom/facebook/widget/a/k;->c()Lcom/facebook/widget/a/f;

    move-result-object v0

    invoke-interface {v0, v1, p0}, Lcom/facebook/widget/a/f;->a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/h;)V

    .line 70
    return-void
.end method

.method protected replaceText(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 81
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactAutoCompleteTextView;->clearComposingText()V

    .line 82
    return-void
.end method

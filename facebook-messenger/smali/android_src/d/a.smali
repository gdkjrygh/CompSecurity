.class public Landroid_src/d/a;
.super Ljava/lang/Object;
.source "PhoneNumberFormattingTextWatcher.java"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Lcom/facebook/phonenumbers/AsYouTypeFormatter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 70
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid_src/d/a;-><init>(Ljava/lang/String;)V

    .line 71
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid_src/d/a;->a:Z

    .line 80
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 81
    :cond_0
    invoke-static {}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->getInstance()Lcom/facebook/phonenumbers/PhoneNumberUtil;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->getAsYouTypeFormatter(Ljava/lang/String;)Lcom/facebook/phonenumbers/AsYouTypeFormatter;

    move-result-object v0

    iput-object v0, p0, Landroid_src/d/a;->c:Lcom/facebook/phonenumbers/AsYouTypeFormatter;

    .line 82
    return-void
.end method

.method private a(CZ)Ljava/lang/String;
    .locals 1

    .prologue
    .line 165
    if-eqz p2, :cond_0

    iget-object v0, p0, Landroid_src/d/a;->c:Lcom/facebook/phonenumbers/AsYouTypeFormatter;

    invoke-virtual {v0, p1}, Lcom/facebook/phonenumbers/AsYouTypeFormatter;->inputDigitAndRememberPosition(C)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid_src/d/a;->c:Lcom/facebook/phonenumbers/AsYouTypeFormatter;

    invoke-virtual {v0, p1}, Lcom/facebook/phonenumbers/AsYouTypeFormatter;->inputDigit(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Ljava/lang/CharSequence;I)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 139
    add-int/lit8 v6, p2, -0x1

    .line 140
    const/4 v2, 0x0

    .line 141
    iget-object v0, p0, Landroid_src/d/a;->c:Lcom/facebook/phonenumbers/AsYouTypeFormatter;

    invoke-virtual {v0}, Lcom/facebook/phonenumbers/AsYouTypeFormatter;->clear()V

    .line 144
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    move v3, v1

    move v0, v1

    move v4, v1

    .line 145
    :goto_0
    if-ge v3, v7, :cond_2

    .line 146
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    .line 147
    invoke-static {v5}, Landroid/telephony/PhoneNumberUtils;->isNonSeparator(C)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 148
    if-eqz v4, :cond_0

    .line 149
    invoke-direct {p0, v4, v0}, Landroid_src/d/a;->a(CZ)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    move v0, v1

    :cond_0
    move v4, v5

    move-object v5, v2

    .line 154
    :goto_1
    if-ne v3, v6, :cond_1

    .line 155
    const/4 v0, 0x1

    .line 145
    :cond_1
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move-object v2, v5

    goto :goto_0

    .line 158
    :cond_2
    if-eqz v4, :cond_3

    .line 159
    invoke-direct {p0, v4, v0}, Landroid_src/d/a;->a(CZ)Ljava/lang/String;

    move-result-object v2

    .line 161
    :cond_3
    return-object v2

    :cond_4
    move-object v5, v2

    goto :goto_1
.end method

.method private a()V
    .locals 1

    .prologue
    .line 170
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid_src/d/a;->b:Z

    .line 171
    iget-object v0, p0, Landroid_src/d/a;->c:Lcom/facebook/phonenumbers/AsYouTypeFormatter;

    invoke-virtual {v0}, Lcom/facebook/phonenumbers/AsYouTypeFormatter;->clear()V

    .line 172
    return-void
.end method

.method private a(Ljava/lang/CharSequence;II)Z
    .locals 2

    .prologue
    .line 175
    move v0, p2

    :goto_0
    add-int v1, p2, p3

    if-ge v0, v1, :cond_1

    .line 176
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    .line 177
    invoke-static {v1}, Landroid/telephony/PhoneNumberUtils;->isNonSeparator(C)Z

    move-result v1

    if-nez v1, :cond_0

    .line 178
    const/4 v0, 0x1

    .line 181
    :goto_1
    return v0

    .line 175
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 181
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method


# virtual methods
.method public declared-synchronized afterTextChanged(Landroid/text/Editable;)V
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 109
    monitor-enter p0

    :try_start_0
    iget-boolean v2, p0, Landroid_src/d/a;->b:Z

    if-eqz v2, :cond_2

    .line 111
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    iput-boolean v0, p0, Landroid_src/d/a;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    :cond_0
    :goto_1
    monitor-exit p0

    return-void

    :cond_1
    move v0, v1

    .line 111
    goto :goto_0

    .line 114
    :cond_2
    :try_start_1
    iget-boolean v0, p0, Landroid_src/d/a;->a:Z

    if-nez v0, :cond_0

    .line 118
    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid_src/d/a;->a(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v3

    .line 119
    if-eqz v3, :cond_0

    .line 120
    iget-object v0, p0, Landroid_src/d/a;->c:Lcom/facebook/phonenumbers/AsYouTypeFormatter;

    invoke-virtual {v0}, Lcom/facebook/phonenumbers/AsYouTypeFormatter;->getRememberedPosition()I

    move-result v6

    .line 121
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid_src/d/a;->a:Z

    .line 122
    const/4 v1, 0x0

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    move-object v0, p1

    invoke-interface/range {v0 .. v5}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;

    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 126
    invoke-static {p1, v6}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    .line 128
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid_src/d/a;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 109
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .prologue
    .line 87
    iget-boolean v0, p0, Landroid_src/d/a;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid_src/d/a;->b:Z

    if-eqz v0, :cond_1

    .line 94
    :cond_0
    :goto_0
    return-void

    .line 91
    :cond_1
    if-lez p3, :cond_0

    invoke-direct {p0, p1, p2, p3}, Landroid_src/d/a;->a(Ljava/lang/CharSequence;II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    invoke-direct {p0}, Landroid_src/d/a;->a()V

    goto :goto_0
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .prologue
    .line 98
    iget-boolean v0, p0, Landroid_src/d/a;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid_src/d/a;->b:Z

    if-eqz v0, :cond_1

    .line 105
    :cond_0
    :goto_0
    return-void

    .line 102
    :cond_1
    if-lez p4, :cond_0

    invoke-direct {p0, p1, p2, p4}, Landroid_src/d/a;->a(Ljava/lang/CharSequence;II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    invoke-direct {p0}, Landroid_src/d/a;->a()V

    goto :goto_0
.end method

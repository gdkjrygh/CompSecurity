.class public Lcom/facebook/orca/common/ui/a/b;
.super Ljava/lang/Object;
.source "MessageRenderingUtil.java"


# instance fields
.field private final a:Landroid/content/res/Resources;

.field private final b:Lcom/facebook/orca/share/a;

.field private final c:Lcom/facebook/orca/emoji/z;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/facebook/orca/share/a;Lcom/facebook/orca/emoji/z;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/facebook/orca/common/ui/a/b;->a:Landroid/content/res/Resources;

    .line 46
    iput-object p2, p0, Lcom/facebook/orca/common/ui/a/b;->b:Lcom/facebook/orca/share/a;

    .line 47
    iput-object p3, p0, Lcom/facebook/orca/common/ui/a/b;->c:Lcom/facebook/orca/emoji/z;

    .line 48
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/orca/common/ui/a/b;->b:Lcom/facebook/orca/share/a;

    invoke-virtual {v0, p2}, Lcom/facebook/orca/share/a;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/share/Share;

    move-result-object v0

    .line 87
    if-nez v0, :cond_0

    .line 111
    :goto_0
    return-object p1

    .line 90
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/common/ui/a/b;->b:Lcom/facebook/orca/share/a;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/share/a;->a(Lcom/facebook/messages/model/share/Share;)Lcom/facebook/messages/model/share/ShareMedia;

    move-result-object v1

    .line 91
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 92
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/common/ui/a/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 94
    :goto_1
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/facebook/messages/model/share/ShareMedia;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 95
    invoke-virtual {v1}, Lcom/facebook/messages/model/share/ShareMedia;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/facebook/orca/common/ui/a/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 98
    :cond_1
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 99
    if-eqz v1, :cond_5

    .line 100
    const-string v0, "photo"

    invoke-virtual {v1}, Lcom/facebook/messages/model/share/ShareMedia;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/common/ui/a/b;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->share_attachment_shared_a_photo:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_2
    move-object p1, v0

    .line 111
    goto :goto_0

    .line 102
    :cond_3
    const-string v0, "video"

    invoke-virtual {v1}, Lcom/facebook/messages/model/share/ShareMedia;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/common/ui/a/b;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->share_attachment_shared_a_video:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 105
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/common/ui/a/b;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->share_attachment_shared_a_link:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 108
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/common/ui/a/b;->a:Landroid/content/res/Resources;

    sget v1, Lcom/facebook/o;->share_attachment_shared_a_link:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_6
    move-object v0, p1

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 115
    if-nez p2, :cond_1

    .line 135
    :cond_0
    :goto_0
    return-object p1

    .line 119
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 120
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 123
    :cond_2
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 124
    const-string v1, "http"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 125
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    .line 126
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 127
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/common/ui/a/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 129
    :cond_3
    const-string v1, "https"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 130
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    .line 131
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 132
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/common/ui/a/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method private a(Lcom/facebook/location/g;)[Ljava/lang/String;
    .locals 3

    .prologue
    .line 253
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    .line 255
    const/4 v1, 0x0

    invoke-virtual {p1}, Lcom/facebook/location/g;->d()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 256
    const/4 v1, 0x1

    invoke-virtual {p1}, Lcom/facebook/location/g;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 257
    return-object v0
.end method

.method private a(Ljava/lang/String;Lcom/facebook/location/g;)[Ljava/lang/String;
    .locals 3

    .prologue
    .line 205
    invoke-direct {p0, p2}, Lcom/facebook/orca/common/ui/a/b;->a(Lcom/facebook/location/g;)[Ljava/lang/String;

    move-result-object v0

    .line 206
    invoke-virtual {p2}, Lcom/facebook/location/g;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 207
    const/4 v1, 0x1

    invoke-direct {p0, p2}, Lcom/facebook/orca/common/ui/a/b;->b(Lcom/facebook/location/g;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 209
    :cond_0
    return-object v0
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;)Landroid/text/Spanned;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 55
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/common/ui/a/b;->a(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;

    move-result-object v1

    .line 61
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    const-string v0, "<"

    .line 63
    const-string v0, "> "

    .line 64
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 65
    iget-object v2, p0, Lcom/facebook/orca/common/ui/a/b;->a:Landroid/content/res/Resources;

    sget v3, Lcom/facebook/o;->message_subject:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 66
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-static {}, Landroid/text/Spannable$Factory;->getInstance()Landroid/text/Spannable$Factory;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/text/Spannable$Factory;->newSpannable(Ljava/lang/CharSequence;)Landroid/text/Spannable;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 69
    const-string v2, "<"

    invoke-interface {v0, v5, v2}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 70
    const-string v2, "> "

    invoke-interface {v0, v2}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 71
    new-instance v2, Landroid/text/style/StyleSpan;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v3

    const/16 v4, 0x21

    invoke-interface {v0, v2, v5, v3, v4}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    .line 73
    invoke-static {}, Landroid/text/Spannable$Factory;->getInstance()Landroid/text/Spannable$Factory;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/text/Spannable$Factory;->newSpannable(Ljava/lang/CharSequence;)Landroid/text/Spannable;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 80
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/common/ui/a/b;->a:Landroid/content/res/Resources;

    const/high16 v2, 0x41600000    # 14.0f

    invoke-static {v1, v2}, Lcom/facebook/common/w/j;->b(Landroid/content/res/Resources;F)I

    move-result v1

    .line 81
    iget-object v2, p0, Lcom/facebook/orca/common/ui/a/b;->c:Lcom/facebook/orca/emoji/z;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/emoji/z;->a(Landroid/text/Spannable;I)V

    .line 82
    return-object v0

    .line 75
    :cond_0
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-static {}, Landroid/text/Spannable$Factory;->getInstance()Landroid/text/Spannable$Factory;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/text/Spannable$Factory;->newSpannable(Ljava/lang/CharSequence;)Landroid/text/Spannable;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/location/g;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 269
    invoke-virtual {p1}, Lcom/facebook/location/g;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CA"

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/location/g;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "US"

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 271
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/location/g;->e()Ljava/lang/String;

    move-result-object v0

    .line 273
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 140
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 144
    const/4 v0, 0x0

    .line 145
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 146
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 151
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v0, v2, :cond_2

    .line 152
    const-string v0, ""

    .line 154
    :goto_1
    return-object v0

    .line 149
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 154
    :cond_2
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method private b(Lcom/facebook/location/g;Lcom/facebook/location/g;)[Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 222
    invoke-direct {p0, p2}, Lcom/facebook/orca/common/ui/a/b;->a(Lcom/facebook/location/g;)[Ljava/lang/String;

    move-result-object v0

    .line 223
    invoke-virtual {p1}, Lcom/facebook/location/g;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/location/g;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 225
    invoke-direct {p0, p2}, Lcom/facebook/orca/common/ui/a/b;->b(Lcom/facebook/location/g;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3

    .line 226
    invoke-virtual {p1}, Lcom/facebook/location/g;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/location/g;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 229
    aput-object v5, v0, v3

    .line 231
    invoke-virtual {p2}, Lcom/facebook/location/g;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 233
    invoke-virtual {p2}, Lcom/facebook/location/g;->c()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    .line 234
    invoke-virtual {p2}, Lcom/facebook/location/g;->d()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3

    .line 236
    aget-object v1, v0, v4

    aget-object v2, v0, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 238
    aput-object v5, v0, v3

    .line 243
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/threads/Message;)Landroid/text/Spanned;
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/a/b;->b(Lcom/facebook/messages/model/threads/Message;)Landroid/text/Spanned;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/location/g;Lcom/facebook/location/g;)Ljava/lang/String;
    .locals 7
    .param p1    # Lcom/facebook/location/g;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/location/g;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 167
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/location/g;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    :cond_0
    const/4 v0, 0x0

    .line 188
    :goto_0
    return-object v0

    .line 173
    :cond_1
    if-eqz p2, :cond_2

    .line 174
    invoke-direct {p0, p2, p1}, Lcom/facebook/orca/common/ui/a/b;->b(Lcom/facebook/location/g;Lcom/facebook/location/g;)[Ljava/lang/String;

    move-result-object v0

    .line 185
    :goto_1
    aget-object v1, v0, v6

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 186
    iget-object v1, p0, Lcom/facebook/orca/common/ui/a/b;->a:Landroid/content/res/Resources;

    sget v2, Lcom/facebook/o;->message_sent_x:I

    new-array v3, v6, [Ljava/lang/Object;

    aget-object v0, v0, v5

    aput-object v0, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 176
    :cond_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getISO3Country()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 177
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/common/ui/a/b;->a(Ljava/lang/String;Lcom/facebook/location/g;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 181
    :cond_3
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/a/b;->a(Lcom/facebook/location/g;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 188
    :cond_4
    iget-object v1, p0, Lcom/facebook/orca/common/ui/a/b;->a:Landroid/content/res/Resources;

    sget v2, Lcom/facebook/o;->message_sent_x_y:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aget-object v4, v0, v5

    aput-object v4, v3, v5

    aget-object v0, v0, v6

    aput-object v0, v3, v6

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

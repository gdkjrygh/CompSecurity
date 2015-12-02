.class public Lcom/facebook/vvm/a/a;
.super Ljava/lang/Object;
.source "ApplicationDirectedString.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final b:[Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:I

.field private k:Lcom/facebook/vvm/a/b;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 32
    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "d"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "f"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "v"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "m"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "s"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "S"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "p"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "P"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "t"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/vvm/a/a;->b:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput v0, p0, Lcom/facebook/vvm/a/a;->d:I

    .line 76
    iput v0, p0, Lcom/facebook/vvm/a/a;->f:I

    .line 89
    iput v0, p0, Lcom/facebook/vvm/a/a;->j:I

    .line 103
    iput-object p1, p0, Lcom/facebook/vvm/a/a;->a:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/vvm/a/a;
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 120
    new-instance v1, Lcom/facebook/vvm/a/a;

    invoke-direct {v1, p0}, Lcom/facebook/vvm/a/a;-><init>(Ljava/lang/String;)V

    .line 122
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sms://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 124
    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/facebook/vvm/a/a;->c:Ljava/lang/String;

    .line 125
    invoke-virtual {v3}, Landroid/net/Uri;->getPort()I

    move-result v2

    iput v2, v1, Lcom/facebook/vvm/a/a;->d:I

    .line 126
    iget-object v2, v1, Lcom/facebook/vvm/a/a;->c:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget v2, v1, Lcom/facebook/vvm/a/a;->d:I

    if-gez v2, :cond_1

    .line 127
    :cond_0
    const-string v1, "ApplicationDirectedString"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid server info (message: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    :goto_0
    return-object v0

    .line 131
    :cond_1
    sget-object v4, Lcom/facebook/vvm/a/a;->b:[Ljava/lang/String;

    array-length v5, v4

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v5, :cond_3

    aget-object v6, v4, v2

    .line 132
    invoke-virtual {v3, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 133
    if-eqz v7, :cond_2

    .line 134
    invoke-direct {v1, v6, v7}, Lcom/facebook/vvm/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 135
    const-string v1, "ApplicationDirectedString"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid key-value pair (key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 131
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 142
    :cond_3
    invoke-direct {v1}, Lcom/facebook/vvm/a/a;->a()V

    move-object v0, v1

    .line 144
    goto :goto_0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 208
    iget-object v0, p0, Lcom/facebook/vvm/a/a;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/facebook/vvm/a/a;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 213
    iget-object v1, p0, Lcom/facebook/vvm/a/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 214
    const-string v1, "XXXXXXXXX"

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/vvm/a/a;->a:Ljava/lang/String;

    .line 217
    iget-object v0, p0, Lcom/facebook/vvm/a/a;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/facebook/vvm/a/a;->l:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/vvm/a/a;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/facebook/vvm/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/vvm/a/a;->l:Ljava/lang/String;

    .line 222
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 155
    const-string v2, "d"

    invoke-virtual {p1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_2

    .line 157
    const-string v2, ":"

    invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 159
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/facebook/vvm/a/a;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 161
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smtp://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 162
    invoke-virtual {v2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/facebook/vvm/a/a;->e:Ljava/lang/String;

    .line 163
    invoke-virtual {v2}, Landroid/net/Uri;->getPort()I

    move-result v2

    iput v2, p0, Lcom/facebook/vvm/a/a;->f:I

    .line 164
    iget-object v2, p0, Lcom/facebook/vvm/a/a;->e:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/facebook/vvm/a/a;->f:I

    if-gez v2, :cond_3

    .line 165
    :cond_1
    const-string v1, "ApplicationDirectedString"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid SMTP server info ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    :goto_0
    return v0

    .line 168
    :cond_2
    const-string v2, "f"

    invoke-virtual {p1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_5

    .line 170
    const-string v2, "0"

    invoke-virtual {p2, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_4

    .line 171
    iput-boolean v0, p0, Lcom/facebook/vvm/a/a;->g:Z

    :cond_3
    :goto_1
    move v0, v1

    .line 204
    goto :goto_0

    .line 173
    :cond_4
    iput-boolean v1, p0, Lcom/facebook/vvm/a/a;->g:Z

    goto :goto_1

    .line 175
    :cond_5
    const-string v2, "v"

    invoke-virtual {p1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_6

    .line 177
    iput-object p2, p0, Lcom/facebook/vvm/a/a;->h:Ljava/lang/String;

    goto :goto_1

    .line 178
    :cond_6
    const-string v2, "m"

    invoke-virtual {p1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_7

    .line 180
    iput-object p2, p0, Lcom/facebook/vvm/a/a;->i:Ljava/lang/String;

    goto :goto_1

    .line 181
    :cond_7
    const-string v2, "s"

    invoke-virtual {p1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_8

    .line 183
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/facebook/vvm/a/a;->j:I

    goto :goto_1

    .line 184
    :cond_8
    const-string v2, "S"

    invoke-virtual {p1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_9

    .line 186
    invoke-static {p2}, Lcom/facebook/vvm/a/b;->parse(Ljava/lang/String;)Lcom/facebook/vvm/a/b;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/vvm/a/a;->k:Lcom/facebook/vvm/a/b;

    .line 187
    iget-object v2, p0, Lcom/facebook/vvm/a/a;->k:Lcom/facebook/vvm/a/b;

    if-nez v2, :cond_3

    goto :goto_0

    .line 190
    :cond_9
    const-string v0, "P"

    invoke-virtual {p1, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_a

    .line 192
    iput-object p2, p0, Lcom/facebook/vvm/a/a;->l:Ljava/lang/String;

    goto :goto_1

    .line 193
    :cond_a
    const-string v0, "p"

    invoke-virtual {p1, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_b

    .line 195
    iget-object v0, p0, Lcom/facebook/vvm/a/a;->l:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 196
    iput-object p2, p0, Lcom/facebook/vvm/a/a;->l:Ljava/lang/String;

    goto :goto_1

    .line 198
    :cond_b
    const-string v0, "t"

    invoke-virtual {p1, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_c

    .line 200
    iput-object p2, p0, Lcom/facebook/vvm/a/a;->m:Ljava/lang/String;

    goto :goto_1

    .line 202
    :cond_c
    const-string v0, "ApplicationDirectedString"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Uknown key \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\"."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 231
    const-string v3, "luckytechnologycompany"

    .line 232
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move v0, v1

    .line 233
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 234
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 235
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v2, v5, :cond_0

    .line 236
    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    xor-int/2addr v2, v5

    .line 237
    or-int/lit8 v2, v2, 0x60

    .line 238
    and-int/lit8 v2, v2, 0x6f

    .line 240
    :cond_0
    int-to-char v2, v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 233
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 242
    :cond_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 244
    new-instance v3, Ljava/lang/String;

    invoke-static {p0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>([B)V

    .line 245
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 247
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 248
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-eq v0, v5, :cond_2

    .line 249
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    xor-int/2addr v0, v5

    .line 251
    :cond_2
    int-to-char v0, v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 246
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 254
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 306
    iget-object v0, p0, Lcom/facebook/vvm/a/a;->a:Ljava/lang/String;

    return-object v0
.end method

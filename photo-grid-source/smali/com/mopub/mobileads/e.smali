.class final Lcom/mopub/mobileads/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/mopub/mobileads/f;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/mopub/mobileads/f;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 113
    invoke-direct {p0, p1, v0, v0, v0}, Lcom/mopub/mobileads/e;-><init>(Lcom/mopub/mobileads/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    return-void
.end method

.method public constructor <init>(Lcom/mopub/mobileads/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 123
    iput-object p1, p0, Lcom/mopub/mobileads/e;->a:Lcom/mopub/mobileads/f;

    .line 124
    iput-object p2, p0, Lcom/mopub/mobileads/e;->b:Ljava/lang/String;

    .line 125
    iput-object p3, p0, Lcom/mopub/mobileads/e;->c:Ljava/lang/String;

    .line 126
    iput-object p4, p0, Lcom/mopub/mobileads/e;->d:Ljava/lang/String;

    .line 127
    return-void
.end method

.method static synthetic a(Lcom/mopub/mobileads/e;)Lcom/mopub/mobileads/f;
    .locals 1

    .prologue
    .line 102
    .line 2131
    iget-object v0, p0, Lcom/mopub/mobileads/e;->a:Lcom/mopub/mobileads/f;

    .line 102
    return-object v0
.end method

.method static synthetic a(Lcom/mopub/mobileads/e;Lcom/mopub/mobileads/f;)V
    .locals 0

    .prologue
    .line 102
    .line 1135
    iput-object p1, p0, Lcom/mopub/mobileads/e;->a:Lcom/mopub/mobileads/f;

    .line 102
    return-void
.end method

.method static synthetic b(Lcom/mopub/mobileads/e;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    .line 2140
    iget-object v0, p0, Lcom/mopub/mobileads/e;->b:Ljava/lang/String;

    .line 102
    return-object v0
.end method

.method static synthetic c(Lcom/mopub/mobileads/e;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    .line 2145
    iget-object v0, p0, Lcom/mopub/mobileads/e;->c:Ljava/lang/String;

    .line 102
    return-object v0
.end method

.method static synthetic d(Lcom/mopub/mobileads/e;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    .line 2154
    iget-object v0, p0, Lcom/mopub/mobileads/e;->d:Ljava/lang/String;

    .line 102
    return-object v0
.end method

.method static synthetic e(Lcom/mopub/mobileads/e;)V
    .locals 1

    .prologue
    .line 102
    .line 3149
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mobileads/e;->c:Ljava/lang/String;

    .line 102
    return-void
.end method

.method static synthetic f(Lcom/mopub/mobileads/e;)V
    .locals 1

    .prologue
    .line 102
    .line 3158
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mobileads/e;->d:Ljava/lang/String;

    .line 102
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 163
    if-nez p1, :cond_1

    .line 177
    :cond_0
    :goto_0
    return v0

    .line 167
    :cond_1
    if-ne p0, p1, :cond_2

    move v0, v1

    .line 168
    goto :goto_0

    .line 171
    :cond_2
    instance-of v2, p1, Lcom/mopub/mobileads/e;

    if-eqz v2, :cond_0

    .line 175
    check-cast p1, Lcom/mopub/mobileads/e;

    .line 177
    iget-object v2, p0, Lcom/mopub/mobileads/e;->a:Lcom/mopub/mobileads/f;

    iget-object v3, p1, Lcom/mopub/mobileads/e;->a:Lcom/mopub/mobileads/f;

    invoke-virtual {v2, v3}, Lcom/mopub/mobileads/f;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/mopub/mobileads/e;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/mopub/mobileads/e;->b:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/mopub/mobileads/e;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/mopub/mobileads/e;->c:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/mopub/mobileads/e;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/mopub/mobileads/e;->d:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 186
    iget-object v0, p0, Lcom/mopub/mobileads/e;->a:Lcom/mopub/mobileads/f;

    invoke-virtual {v0}, Lcom/mopub/mobileads/f;->ordinal()I

    move-result v0

    add-int/lit16 v0, v0, 0x383

    .line 187
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/mopub/mobileads/e;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mopub/mobileads/e;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v0, v2

    .line 190
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/mopub/mobileads/e;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/mopub/mobileads/e;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v0, v2

    .line 193
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/mopub/mobileads/e;->d:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/mopub/mobileads/e;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 196
    return v0

    :cond_1
    move v0, v1

    .line 187
    goto :goto_0

    :cond_2
    move v0, v1

    .line 190
    goto :goto_1
.end method

.class public Lcom/facebook/user/a/l;
.super Ljava/lang/Object;
.source "NameSplitter.java"


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final d:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:I

.field private final g:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/Locale;

.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    sget-object v0, Ljava/util/Locale;->JAPANESE:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/user/a/l;->a:Ljava/lang/String;

    .line 33
    sget-object v0, Ljava/util/Locale;->KOREAN:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/user/a/l;->b:Ljava/lang/String;

    .line 36
    sget-object v0, Ljava/util/Locale;->CHINESE:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/user/a/l;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)V
    .locals 4

    .prologue
    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    invoke-static {p1}, Lcom/facebook/user/a/l;->a(Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/a/l;->d:Ljava/util/HashSet;

    .line 111
    invoke-static {p2}, Lcom/facebook/user/a/l;->a(Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/a/l;->g:Ljava/util/HashSet;

    .line 112
    invoke-static {p3}, Lcom/facebook/user/a/l;->a(Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/a/l;->e:Ljava/util/HashSet;

    .line 113
    invoke-static {p4}, Lcom/facebook/user/a/l;->a(Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/a/l;->h:Ljava/util/HashSet;

    .line 114
    if-eqz p5, :cond_0

    :goto_0
    iput-object p5, p0, Lcom/facebook/user/a/l;->i:Ljava/util/Locale;

    .line 115
    iget-object v0, p0, Lcom/facebook/user/a/l;->i:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/a/l;->j:Ljava/lang/String;

    .line 117
    const/4 v0, 0x0

    .line 118
    iget-object v1, p0, Lcom/facebook/user/a/l;->e:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 119
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v1, :cond_2

    .line 120
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_2
    move v1, v0

    goto :goto_1

    .line 114
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p5

    goto :goto_0

    .line 124
    :cond_1
    iput v1, p0, Lcom/facebook/user/a/l;->f:I

    .line 125
    return-void

    :cond_2
    move v0, v1

    goto :goto_2
.end method

.method private static a(Ljava/lang/String;)Ljava/util/HashSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 132
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 133
    if-eqz p0, :cond_0

    .line 134
    const-string v0, ","

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 135
    const/4 v0, 0x0

    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_0

    .line 136
    aget-object v3, v2, v0

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 135
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 139
    :cond_0
    return-object v1
.end method


# virtual methods
.method public a(I)I
    .locals 5

    .prologue
    const/4 v1, 0x5

    const/4 v0, 0x4

    const/4 v2, 0x3

    .line 175
    if-nez p1, :cond_4

    .line 176
    sget-object v3, Lcom/facebook/user/a/l;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/user/a/l;->j:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move p1, v0

    .line 194
    :cond_0
    :goto_0
    return p1

    .line 178
    :cond_1
    sget-object v0, Lcom/facebook/user/a/l;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/user/a/l;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move p1, v1

    .line 179
    goto :goto_0

    .line 180
    :cond_2
    sget-object v0, Lcom/facebook/user/a/l;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/user/a/l;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move p1, v2

    .line 181
    goto :goto_0

    .line 183
    :cond_3
    const/4 p1, 0x1

    goto :goto_0

    .line 185
    :cond_4
    const/4 v3, 0x2

    if-ne p1, v3, :cond_0

    .line 186
    sget-object v3, Lcom/facebook/user/a/l;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/user/a/l;->j:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move p1, v0

    .line 187
    goto :goto_0

    .line 188
    :cond_5
    sget-object v0, Lcom/facebook/user/a/l;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/user/a/l;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    move p1, v1

    .line 189
    goto :goto_0

    :cond_6
    move p1, v2

    .line 191
    goto :goto_0
.end method

.method public a([Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 146
    if-nez p2, :cond_1

    .line 165
    :cond_0
    return v1

    .line 150
    :cond_1
    new-instance v3, Lcom/facebook/user/a/m;

    invoke-direct {v3, p2}, Lcom/facebook/user/a/m;-><init>(Ljava/lang/String;)V

    .line 152
    invoke-static {v3}, Lcom/facebook/user/a/m;->a(Lcom/facebook/user/a/m;)I

    move-result v0

    invoke-static {v3}, Lcom/facebook/user/a/m;->b(Lcom/facebook/user/a/m;)I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 156
    invoke-static {v3}, Lcom/facebook/user/a/m;->c(Lcom/facebook/user/a/m;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v3}, Lcom/facebook/user/a/m;->a(Lcom/facebook/user/a/m;)I

    move-result v2

    aget-object v0, v0, v2

    .line 157
    iget-object v2, p0, Lcom/facebook/user/a/l;->d:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    invoke-static {v3}, Lcom/facebook/user/a/m;->d(Lcom/facebook/user/a/m;)I

    .line 161
    :cond_2
    invoke-static {v3}, Lcom/facebook/user/a/m;->a(Lcom/facebook/user/a/m;)I

    move-result v0

    :goto_0
    invoke-static {v3}, Lcom/facebook/user/a/m;->b(Lcom/facebook/user/a/m;)I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 162
    add-int/lit8 v2, v1, 0x1

    invoke-static {v3}, Lcom/facebook/user/a/m;->c(Lcom/facebook/user/a/m;)[Ljava/lang/String;

    move-result-object v4

    aget-object v4, v4, v0

    aput-object v4, p1, v1

    .line 161
    add-int/lit8 v0, v0, 0x1

    move v1, v2

    goto :goto_0
.end method

.class public Lcom/facebook/user/a/a;
.super Ljava/lang/Object;
.source "ContactLocaleUtils.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "UseSparseArrays"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static d:Lcom/facebook/user/a/a;


# instance fields
.field private e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/facebook/user/a/d;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/facebook/user/a/d;

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 116
    sget-object v0, Ljava/util/Locale;->CHINESE:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/user/a/a;->a:Ljava/lang/String;

    .line 117
    sget-object v0, Ljava/util/Locale;->JAPANESE:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/user/a/a;->b:Ljava/lang/String;

    .line 118
    sget-object v0, Ljava/util/Locale;->KOREAN:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/user/a/a;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/user/a/a;->e:Ljava/util/HashMap;

    .line 124
    new-instance v0, Lcom/facebook/user/a/d;

    invoke-direct {v0, p0}, Lcom/facebook/user/a/d;-><init>(Lcom/facebook/user/a/a;)V

    iput-object v0, p0, Lcom/facebook/user/a/a;->f:Lcom/facebook/user/a/d;

    .line 129
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/user/a/a;->a(Ljava/util/Locale;)V

    .line 130
    return-void
.end method

.method private a(I)I
    .locals 2

    .prologue
    .line 194
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/facebook/user/a/a;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/user/a/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/user/a/a;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/user/a/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 196
    const/4 p1, 0x3

    .line 198
    :cond_0
    return p1
.end method

.method public static declared-synchronized a()Lcom/facebook/user/a/a;
    .locals 2

    .prologue
    .line 187
    const-class v1, Lcom/facebook/user/a/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/facebook/user/a/a;->d:Lcom/facebook/user/a/a;

    if-nez v0, :cond_0

    .line 188
    new-instance v0, Lcom/facebook/user/a/a;

    invoke-direct {v0}, Lcom/facebook/user/a/a;-><init>()V

    sput-object v0, Lcom/facebook/user/a/a;->d:Lcom/facebook/user/a/a;

    .line 190
    :cond_0
    sget-object v0, Lcom/facebook/user/a/a;->d:Lcom/facebook/user/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 187
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Ljava/lang/Integer;)Lcom/facebook/user/a/d;
    .locals 4

    .prologue
    .line 157
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 158
    invoke-direct {p0, v1}, Lcom/facebook/user/a/a;->a(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 159
    sget-object v2, Lcom/facebook/user/a/a;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/user/a/a;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 160
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 162
    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/user/a/a;->b(Ljava/lang/Integer;)Lcom/facebook/user/a/d;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized b(Ljava/lang/Integer;)Lcom/facebook/user/a/d;
    .locals 3

    .prologue
    .line 166
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/user/a/a;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/a/d;

    .line 167
    if-nez v0, :cond_0

    .line 168
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    .line 169
    new-instance v0, Lcom/facebook/user/a/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/user/a/c;-><init>(Lcom/facebook/user/a/a;Lcom/facebook/user/a/b;)V

    .line 170
    iget-object v1, p0, Lcom/facebook/user/a/a;->e:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/user/a/a;->f:Lcom/facebook/user/a/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-object v0

    .line 166
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 145
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/user/a/a;->a(Ljava/lang/Integer;)Lcom/facebook/user/a/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/user/a/d;->a(Ljava/lang/String;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/Locale;)V
    .locals 1

    .prologue
    .line 133
    if-nez p1, :cond_0

    .line 134
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/a/a;->g:Ljava/lang/String;

    .line 138
    :goto_0
    return-void

    .line 136
    :cond_0
    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/a/a;->g:Ljava/lang/String;

    goto :goto_0
.end method

.class public abstract Lcom/facebook/orca/f/d;
.super Ljava/lang/Object;
.source "ByThreadViewSpecPreferenceManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/facebook/orca/f/k;

.field private final d:Lcom/facebook/orca/f/z;

.field private final e:Lcom/facebook/common/e/h;

.field private final f:Lcom/facebook/common/time/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/facebook/orca/f/d;

    sput-object v0, Lcom/facebook/orca/f/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/f/k;Lcom/facebook/orca/f/z;Lcom/facebook/common/e/h;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Lcom/facebook/orca/f/d;->b:Lcom/facebook/prefs/shared/d;

    .line 64
    iput-object p2, p0, Lcom/facebook/orca/f/d;->c:Lcom/facebook/orca/f/k;

    .line 65
    iput-object p3, p0, Lcom/facebook/orca/f/d;->d:Lcom/facebook/orca/f/z;

    .line 66
    iput-object p4, p0, Lcom/facebook/orca/f/d;->e:Lcom/facebook/common/e/h;

    .line 67
    iput-object p5, p0, Lcom/facebook/orca/f/d;->f:Lcom/facebook/common/time/a;

    .line 68
    return-void
.end method

.method private a(Ljava/lang/String;J)Ljava/lang/String;
    .locals 2

    .prologue
    .line 175
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    const-string v1, "tvs1:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    if-eqz p1, :cond_0

    .line 178
    sget-object v1, Lcom/google/common/base/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    :goto_0
    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 185
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 181
    :cond_0
    const-string v1, "<null>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 186
    :catch_0
    move-exception v0

    .line 187
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private c(Ljava/lang/Object;)Lcom/facebook/orca/f/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/facebook/orca/f/f",
            "<TT;>;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 198
    if-nez p1, :cond_0

    move-object v1, v2

    .line 230
    :goto_0
    return-object v1

    .line 202
    :cond_0
    :try_start_0
    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 203
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    .line 204
    const-string v3, "tvs1:"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 205
    const-string v3, "tvs1:"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 206
    const-string v3, ","

    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 207
    array-length v1, v4

    const/4 v3, 0x2

    if-ge v1, v3, :cond_1

    .line 208
    iget-object v1, p0, Lcom/facebook/orca/f/d;->e:Lcom/facebook/common/e/h;

    sget-object v3, Lcom/facebook/orca/f/d;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Parse error"

    invoke-interface {v1, v3, v4}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v2

    .line 209
    goto :goto_0

    .line 211
    :cond_1
    const/4 v1, 0x0

    aget-object v1, v4, v1

    .line 213
    const-string v3, "<null>"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v3, v2

    .line 218
    :goto_1
    const/4 v1, 0x1

    aget-object v1, v4, v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 219
    new-instance v1, Lcom/facebook/orca/f/f;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/f/d;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const/4 v6, 0x0

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/facebook/orca/f/f;-><init>(Ljava/lang/Object;JLcom/facebook/orca/f/e;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 225
    :catch_0
    move-exception v1

    .line 226
    iget-object v3, p0, Lcom/facebook/orca/f/d;->e:Lcom/facebook/common/e/h;

    sget-object v4, Lcom/facebook/orca/f/d;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Parse error"

    invoke-interface {v3, v4, v5, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v1, v2

    .line 227
    goto :goto_0

    .line 216
    :cond_2
    :try_start_1
    sget-object v3, Lcom/google/common/base/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v3}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    goto :goto_1

    .line 224
    :cond_3
    new-instance v1, Lcom/facebook/orca/f/f;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/facebook/orca/f/f;-><init>(Ljava/lang/Object;JLcom/facebook/orca/f/e;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 228
    :catch_1
    move-exception v1

    .line 229
    iget-object v3, p0, Lcom/facebook/orca/f/d;->e:Lcom/facebook/common/e/h;

    sget-object v4, Lcom/facebook/orca/f/d;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Parse error"

    invoke-interface {v3, v4, v5, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v1, v2

    .line 230
    goto/16 :goto_0
.end method

.method private c(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            ">;"
        }
    .end annotation

    .prologue
    .line 241
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 266
    :goto_0
    return-object v0

    .line 244
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    .line 245
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 246
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    .line 247
    invoke-virtual {p0, v1}, Lcom/facebook/orca/f/d;->b(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 250
    iget-object v2, p0, Lcom/facebook/orca/f/d;->d:Lcom/facebook/orca/f/z;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/f/z;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v1

    .line 251
    if-eqz v1, :cond_1

    .line 252
    invoke-virtual {p0, v1}, Lcom/facebook/orca/f/d;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 266
    :cond_1
    :goto_1
    invoke-virtual {v0}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 254
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 255
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->f()Lcom/facebook/user/UserIdentifier;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/user/UserKey;->a(Lcom/facebook/user/UserIdentifier;)Lcom/facebook/user/UserKey;

    move-result-object v1

    .line 256
    invoke-virtual {p0, v1}, Lcom/facebook/orca/f/d;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/prefs/shared/ae;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 259
    iget-object v2, p0, Lcom/facebook/orca/f/d;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/f/k;->c(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 260
    if-eqz v1, :cond_1

    .line 261
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/orca/f/d;->b(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 264
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method


# virtual methods
.method protected abstract a(Lcom/facebook/user/UserKey;)Lcom/facebook/prefs/shared/ae;
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            ")TT;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 77
    .line 78
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/d;->c(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Ljava/util/List;

    move-result-object v0

    .line 79
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v2

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 80
    iget-object v4, p0, Lcom/facebook/orca/f/d;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v4, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 81
    iget-object v4, p0, Lcom/facebook/orca/f/d;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v4, v0}, Lcom/facebook/prefs/shared/d;->c(Lcom/facebook/prefs/shared/ae;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/f/d;->c(Ljava/lang/Object;)Lcom/facebook/orca/f/f;

    move-result-object v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    if-nez v1, :cond_1

    :cond_0
    :goto_1
    move-object v1, v0

    .line 89
    goto :goto_0

    .line 85
    :cond_1
    invoke-static {v0}, Lcom/facebook/orca/f/f;->a(Lcom/facebook/orca/f/f;)J

    move-result-wide v4

    invoke-static {v1}, Lcom/facebook/orca/f/f;->a(Lcom/facebook/orca/f/f;)J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-gtz v4, :cond_0

    :cond_2
    move-object v0, v1

    goto :goto_1

    .line 91
    :cond_3
    if-eqz v1, :cond_4

    .line 92
    invoke-static {v1}, Lcom/facebook/orca/f/f;->b(Lcom/facebook/orca/f/f;)Ljava/lang/Object;

    move-result-object v2

    .line 94
    :cond_4
    return-object v2
.end method

.method protected abstract a(Ljava/lang/String;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation
.end method

.method protected abstract a(Ljava/lang/Object;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/f/d;->f:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    .line 105
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/d;->c(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Ljava/util/List;

    move-result-object v0

    .line 106
    iget-object v3, p0, Lcom/facebook/orca/f/d;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v3}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v3

    .line 107
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 108
    invoke-virtual {p0, p2}, Lcom/facebook/orca/f/d;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5, v1, v2}, Lcom/facebook/orca/f/d;->a(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v0, v5}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    goto :goto_0

    .line 110
    :cond_0
    invoke-interface {v3}, Lcom/facebook/prefs/shared/e;->a()V

    .line 111
    return-void
.end method

.method protected abstract b(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
.end method

.method protected abstract b(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation
.end method

.method public b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 1

    .prologue
    .line 119
    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/d;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/orca/f/d;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/Object;)V

    .line 120
    return-void
.end method

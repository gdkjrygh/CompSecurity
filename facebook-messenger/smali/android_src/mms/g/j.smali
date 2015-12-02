.class public final Landroid_src/mms/g/j;
.super Landroid_src/mms/g/a;
.source "PduCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid_src/mms/g/a",
        "<",
        "Landroid/net/Uri;",
        "Landroid_src/mms/g/k;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Landroid/content/UriMatcher;

.field private static final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static c:Landroid_src/mms/g/j;


# instance fields
.field private final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/HashSet",
            "<",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Long;",
            "Ljava/util/HashSet",
            "<",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x6

    const/4 v7, 0x3

    const/4 v6, 0x1

    const/4 v5, 0x4

    const/4 v4, 0x2

    .line 55
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    sput-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    .line 56
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 57
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms"

    const-string v2, "#"

    invoke-virtual {v0, v1, v2, v6}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 58
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms"

    const-string v2, "inbox"

    invoke-virtual {v0, v1, v2, v4}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 59
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms"

    const-string v2, "inbox/#"

    invoke-virtual {v0, v1, v2, v7}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 60
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms"

    const-string v2, "sent"

    invoke-virtual {v0, v1, v2, v5}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 61
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms"

    const-string v2, "sent/#"

    const/4 v3, 0x5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 62
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms"

    const-string v2, "drafts"

    invoke-virtual {v0, v1, v2, v8}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 63
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms"

    const-string v2, "drafts/#"

    const/4 v3, 0x7

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 64
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms"

    const-string v2, "outbox"

    const/16 v3, 0x8

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 65
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms"

    const-string v2, "outbox/#"

    const/16 v3, 0x9

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 66
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms-sms"

    const-string v2, "conversations"

    const/16 v3, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 67
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    const-string v1, "mms-sms"

    const-string v2, "conversations/#"

    const/16 v3, 0xb

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 69
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroid_src/mms/g/j;->b:Ljava/util/HashMap;

    .line 70
    sget-object v0, Landroid_src/mms/g/j;->b:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Landroid_src/mms/g/j;->b:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Landroid_src/mms/g/j;->b:Ljava/util/HashMap;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Landroid_src/mms/g/j;->b:Ljava/util/HashMap;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 79
    invoke-direct {p0}, Landroid_src/mms/g/a;-><init>()V

    .line 80
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid_src/mms/g/j;->d:Ljava/util/HashMap;

    .line 81
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid_src/mms/g/j;->e:Ljava/util/HashMap;

    .line 82
    return-void
.end method

.method private a(J)V
    .locals 3

    .prologue
    .line 227
    iget-object v0, p0, Landroid_src/mms/g/j;->e:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    .line 228
    if-eqz v0, :cond_1

    .line 229
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 230
    invoke-super {p0, v0}, Landroid_src/mms/g/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid_src/mms/g/k;

    .line 231
    if-eqz v1, :cond_0

    .line 232
    invoke-direct {p0, v0, v1}, Landroid_src/mms/g/j;->c(Landroid/net/Uri;Landroid_src/mms/g/k;)V

    goto :goto_0

    .line 236
    :cond_1
    return-void
.end method

.method private a(Ljava/lang/Integer;)V
    .locals 3

    .prologue
    .line 202
    if-eqz p1, :cond_1

    .line 203
    iget-object v0, p0, Landroid_src/mms/g/j;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    .line 204
    if-eqz v0, :cond_1

    .line 205
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 206
    invoke-super {p0, v0}, Landroid_src/mms/g/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid_src/mms/g/k;

    .line 207
    if-eqz v1, :cond_0

    .line 208
    invoke-direct {p0, v0, v1}, Landroid_src/mms/g/j;->b(Landroid/net/Uri;Landroid_src/mms/g/k;)V

    goto :goto_0

    .line 213
    :cond_1
    return-void
.end method

.method public static final declared-synchronized b()Landroid_src/mms/g/j;
    .locals 2

    .prologue
    .line 85
    const-class v1, Landroid_src/mms/g/j;

    monitor-enter v1

    :try_start_0
    sget-object v0, Landroid_src/mms/g/j;->c:Landroid_src/mms/g/j;

    if-nez v0, :cond_0

    .line 89
    new-instance v0, Landroid_src/mms/g/j;

    invoke-direct {v0}, Landroid_src/mms/g/j;-><init>()V

    sput-object v0, Landroid_src/mms/g/j;->c:Landroid_src/mms/g/j;

    .line 91
    :cond_0
    sget-object v0, Landroid_src/mms/g/j;->c:Landroid_src/mms/g/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 85
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private b(Landroid/net/Uri;)Landroid_src/mms/g/k;
    .locals 1

    .prologue
    .line 151
    invoke-super {p0, p1}, Landroid_src/mms/g/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid_src/mms/g/k;

    .line 152
    if-eqz v0, :cond_0

    .line 153
    invoke-direct {p0, p1, v0}, Landroid_src/mms/g/j;->b(Landroid/net/Uri;Landroid_src/mms/g/k;)V

    .line 154
    invoke-direct {p0, p1, v0}, Landroid_src/mms/g/j;->c(Landroid/net/Uri;Landroid_src/mms/g/k;)V

    .line 157
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Landroid/net/Uri;Landroid_src/mms/g/k;)V
    .locals 3

    .prologue
    .line 216
    iget-object v0, p0, Landroid_src/mms/g/j;->e:Ljava/util/HashMap;

    invoke-virtual {p2}, Landroid_src/mms/g/k;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    .line 217
    if-eqz v0, :cond_0

    .line 218
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 220
    :cond_0
    return-void
.end method

.method private c(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 2

    .prologue
    .line 173
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v0

    .line 176
    packed-switch v0, :pswitch_data_0

    .line 188
    :pswitch_0
    const/4 p1, 0x0

    .line 194
    :goto_0
    :pswitch_1
    return-object p1

    .line 184
    :pswitch_2
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    .line 185
    sget-object v1, Landroid_src/c/d;->a:Landroid/net/Uri;

    invoke-static {v1, v0}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    .line 176
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private c(Landroid/net/Uri;Landroid_src/mms/g/k;)V
    .locals 3

    .prologue
    .line 239
    iget-object v0, p0, Landroid_src/mms/g/j;->e:Ljava/util/HashMap;

    invoke-virtual {p2}, Landroid_src/mms/g/k;->b()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    .line 240
    if-eqz v0, :cond_0

    .line 241
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 243
    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized a(Landroid/net/Uri;)Landroid_src/mms/g/k;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 121
    monitor-enter p0

    :try_start_0
    sget-object v0, Landroid_src/mms/g/j;->a:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    .line 122
    packed-switch v0, :pswitch_data_0

    move-object v0, v1

    .line 146
    :goto_0
    monitor-exit p0

    return-object v0

    .line 124
    :pswitch_0
    :try_start_1
    invoke-direct {p0, p1}, Landroid_src/mms/g/j;->b(Landroid/net/Uri;)Landroid_src/mms/g/k;

    move-result-object v0

    goto :goto_0

    .line 129
    :pswitch_1
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    .line 130
    sget-object v1, Landroid_src/c/d;->a:Landroid/net/Uri;

    invoke-static {v1, v0}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid_src/mms/g/j;->b(Landroid/net/Uri;)Landroid_src/mms/g/k;

    move-result-object v0

    goto :goto_0

    .line 134
    :pswitch_2
    invoke-virtual {p0}, Landroid_src/mms/g/j;->a()V

    move-object v0, v1

    .line 135
    goto :goto_0

    .line 140
    :pswitch_3
    sget-object v2, Landroid_src/mms/g/j;->b:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-direct {p0, v0}, Landroid_src/mms/g/j;->a(Ljava/lang/Integer;)V

    move-object v0, v1

    .line 141
    goto :goto_0

    .line 143
    :pswitch_4
    invoke-static {p1}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Landroid_src/mms/g/j;->a(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v1

    .line 144
    goto :goto_0

    .line 121
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 122
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_4
    .end packed-switch
.end method

.method public declared-synchronized a()V
    .locals 1

    .prologue
    .line 162
    monitor-enter p0

    :try_start_0
    invoke-super {p0}, Landroid_src/mms/g/a;->a()V

    .line 164
    iget-object v0, p0, Landroid_src/mms/g/j;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 165
    iget-object v0, p0, Landroid_src/mms/g/j;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    monitor-exit p0

    return-void

    .line 162
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Landroid/net/Uri;Landroid_src/mms/g/k;)Z
    .locals 5

    .prologue
    .line 96
    monitor-enter p0

    :try_start_0
    invoke-virtual {p2}, Landroid_src/mms/g/k;->b()I

    move-result v1

    .line 97
    iget-object v0, p0, Landroid_src/mms/g/j;->d:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    .line 98
    if-nez v0, :cond_2

    .line 99
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 100
    iget-object v2, p0, Landroid_src/mms/g/j;->d:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v0

    .line 103
    :goto_0
    invoke-virtual {p2}, Landroid_src/mms/g/k;->c()J

    move-result-wide v2

    .line 104
    iget-object v0, p0, Landroid_src/mms/g/j;->e:Ljava/util/HashMap;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    .line 105
    if-nez v0, :cond_0

    .line 106
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 107
    iget-object v4, p0, Landroid_src/mms/g/j;->e:Ljava/util/HashMap;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v4, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    :cond_0
    invoke-direct {p0, p1}, Landroid_src/mms/g/j;->c(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v2

    .line 111
    invoke-super {p0, v2, p2}, Landroid_src/mms/g/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    .line 112
    if-eqz v3, :cond_1

    .line 113
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 114
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    :cond_1
    monitor-exit p0

    return v3

    .line 96
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 31
    check-cast p1, Landroid/net/Uri;

    check-cast p2, Landroid_src/mms/g/k;

    invoke-virtual {p0, p1, p2}, Landroid_src/mms/g/j;->a(Landroid/net/Uri;Landroid_src/mms/g/k;)Z

    move-result v0

    return v0
.end method

.method public synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 31
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Landroid_src/mms/g/j;->a(Landroid/net/Uri;)Landroid_src/mms/g/k;

    move-result-object v0

    return-object v0
.end method

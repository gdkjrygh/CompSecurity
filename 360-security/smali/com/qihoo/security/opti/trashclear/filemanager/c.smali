.class public Lcom/qihoo/security/opti/trashclear/filemanager/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/filemanager/c$1;,
        Lcom/qihoo/security/opti/trashclear/filemanager/c$f;,
        Lcom/qihoo/security/opti/trashclear/filemanager/c$d;,
        Lcom/qihoo/security/opti/trashclear/filemanager/c$c;,
        Lcom/qihoo/security/opti/trashclear/filemanager/c$b;,
        Lcom/qihoo/security/opti/trashclear/filemanager/c$a;,
        Lcom/qihoo/security/opti/trashclear/filemanager/c$e;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/opti/trashclear/filemanager/c$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Landroid/widget/ImageView;",
            "Lcom/qihoo/security/opti/trashclear/filemanager/c$c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Landroid/os/Handler;

.field private d:Lcom/qihoo/security/opti/trashclear/filemanager/c$f;

.field private e:Z

.field private f:Z

.field private final g:Landroid/content/Context;

.field private final h:Lcom/qihoo/security/opti/trashclear/filemanager/c$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 114
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/opti/trashclear/filemanager/c$d;)V
    .locals 1

    .prologue
    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 118
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->c:Landroid/os/Handler;

    .line 131
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->g:Landroid/content/Context;

    .line 132
    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->h:Lcom/qihoo/security/opti/trashclear/filemanager/c$d;

    .line 133
    return-void
.end method

.method static synthetic a()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/filemanager/c;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method private a(Landroid/widget/ImageView;Ljava/lang/String;Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 172
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;

    .line 174
    if-nez v0, :cond_2

    .line 175
    invoke-static {p3}, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;->a(Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;)Lcom/qihoo/security/opti/trashclear/filemanager/c$e;

    move-result-object v0

    .line 176
    if-nez v0, :cond_0

    move v0, v1

    .line 192
    :goto_0
    return v0

    .line 180
    :cond_0
    sget-object v2, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    :cond_1
    iput v1, v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;->b:I

    move v0, v1

    .line 192
    goto :goto_0

    .line 181
    :cond_2
    iget v3, v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;->b:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 182
    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;->a()Z

    move-result v3

    if-eqz v3, :cond_3

    move v0, v2

    .line 183
    goto :goto_0

    .line 186
    :cond_3
    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;->a(Landroid/widget/ImageView;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v0, v2

    .line 187
    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/filemanager/c;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->g:Landroid/content/Context;

    return-object v0
.end method

.method private b()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 251
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->e:Z

    if-nez v0, :cond_0

    .line 252
    iput-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->e:Z

    .line 253
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->c:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 255
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/filemanager/c;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->c:Landroid/os/Handler;

    return-object v0
.end method

.method private c()V
    .locals 4

    .prologue
    .line 284
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 285
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 286
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 287
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;

    .line 288
    iget-object v3, v1, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->a:Ljava/lang/String;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->c:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    invoke-direct {p0, v0, v3, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a(Landroid/widget/ImageView;Ljava/lang/String;Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;)Z

    move-result v1

    .line 289
    if-eqz v1, :cond_0

    .line 290
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 291
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->h:Lcom/qihoo/security/opti/trashclear/filemanager/c$d;

    invoke-interface {v1, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/c$d;->a(Landroid/widget/ImageView;)V

    goto :goto_0

    .line 295
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 296
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b()V

    .line 298
    :cond_2
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Z)J
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 196
    const-string/jumbo v0, "external"

    .line 197
    if-eqz p2, :cond_0

    invoke-static {v0}, Landroid/provider/MediaStore$Video$Media;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 198
    :goto_0
    const-string/jumbo v3, "_data=?"

    .line 200
    new-array v4, v6, [Ljava/lang/String;

    aput-object p1, v4, v5

    .line 202
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const-string/jumbo v0, "_id"

    aput-object v0, v2, v5

    const-string/jumbo v0, "_data"

    aput-object v0, v2, v6

    .line 205
    const-wide/16 v6, 0x0

    .line 207
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 208
    if-eqz v2, :cond_1

    .line 209
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 210
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-wide v0

    .line 218
    :goto_1
    invoke-static {v2}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/database/Cursor;)V

    .line 220
    :goto_2
    return-wide v0

    .line 197
    :cond_0
    invoke-static {v0}, Landroid/provider/MediaStore$Images$Media;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    goto :goto_0

    .line 213
    :catch_0
    move-exception v0

    move-object v0, v8

    .line 218
    :goto_3
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/database/Cursor;)V

    move-wide v0, v6

    .line 219
    goto :goto_2

    .line 218
    :catchall_0
    move-exception v0

    :goto_4
    invoke-static {v8}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/database/Cursor;)V

    throw v0

    :catchall_1
    move-exception v0

    move-object v8, v2

    goto :goto_4

    .line 213
    :catch_1
    move-exception v0

    move-object v0, v2

    goto :goto_3

    :cond_1
    move-wide v0, v6

    goto :goto_1
.end method

.method public a(Landroid/widget/ImageView;)V
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    return-void
.end method

.method public a(Landroid/widget/ImageView;Ljava/lang/String;JLcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;)Z
    .locals 3

    .prologue
    .line 154
    invoke-direct {p0, p1, p2, p5}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a(Landroid/widget/ImageView;Ljava/lang/String;Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;)Z

    move-result v0

    .line 155
    if-eqz v0, :cond_1

    .line 156
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    :cond_0
    :goto_0
    return v0

    .line 158
    :cond_1
    new-instance v1, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;

    invoke-direct {v1, p2, p3, p4, p5}, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;-><init>(Ljava/lang/String;JLcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;)V

    .line 159
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    iget-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->f:Z

    if-nez v1, :cond_0

    .line 161
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b()V

    goto :goto_0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 259
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    move v0, v1

    .line 280
    :cond_0
    :goto_0
    return v0

    .line 261
    :pswitch_0
    iput-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->e:Z

    .line 262
    iget-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->f:Z

    if-nez v1, :cond_0

    .line 263
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->d:Lcom/qihoo/security/opti/trashclear/filemanager/c$f;

    if-nez v1, :cond_1

    .line 264
    new-instance v1, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/c;)V

    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->d:Lcom/qihoo/security/opti/trashclear/filemanager/c$f;

    .line 265
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->d:Lcom/qihoo/security/opti/trashclear/filemanager/c$f;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->start()V

    .line 268
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->d:Lcom/qihoo/security/opti/trashclear/filemanager/c$f;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->a()V

    goto :goto_0

    .line 274
    :pswitch_1
    iget-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c;->f:Z

    if-nez v1, :cond_0

    .line 275
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->c()V

    goto :goto_0

    .line 259
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

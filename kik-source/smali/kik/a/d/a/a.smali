.class public Lkik/a/d/a/a;
.super Lkik/a/d/a/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/d/a/a$1;,
        Lkik/a/d/a/a$b;,
        Lkik/a/d/a/a$c;,
        Lkik/a/d/a/a$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;

.field private static final b:Ljava/util/List;

.field private static c:Ljava/util/Map;


# instance fields
.field private d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Ljava/util/ArrayList;

.field private j:Ljava/util/Hashtable;

.field private k:Ljava/util/Hashtable;

.field private l:Ljava/util/Hashtable;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 34
    sput-object v0, Lkik/a/d/a/a;->a:Ljava/util/Map;

    const-string v1, "com.kik.ext.camera"

    const-string v2, "Camera"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    sget-object v0, Lkik/a/d/a/a;->a:Ljava/util/Map;

    const-string v1, "com.kik.ext.gallery"

    const-string v2, "Gallery"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    sget-object v0, Lkik/a/d/a/a;->a:Ljava/util/Map;

    const-string v1, "com.kik.ext.video-camera"

    const-string v2, "Video"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    sget-object v0, Lkik/a/d/a/a;->a:Ljava/util/Map;

    const-string v1, "com.kik.ext.video-gallery"

    const-string v2, "Gallery"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    sget-object v0, Lkik/a/d/a/a;->a:Ljava/util/Map;

    const-string v1, "com.kik.ext.gif"

    const-string v2, "GIF"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "com.kik.ext.camera"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "com.kik.ext.gallery"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "com.kik.ext.video-camera"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "com.kik.ext.video-gallery"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "com.kik.ext.gif"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lkik/a/d/a/a;->b:Ljava/util/List;

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 74
    sput-object v0, Lkik/a/d/a/a;->c:Ljava/util/Map;

    sget-object v1, Lkik/a/d/a/a$c;->a:Lkik/a/d/a/a$c;

    const-string v2, "video/webm"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    sget-object v0, Lkik/a/d/a/a;->c:Ljava/util/Map;

    sget-object v1, Lkik/a/d/a/a$c;->c:Lkik/a/d/a/a$c;

    const-string v2, "video/mp4"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v0, Lkik/a/d/a/a;->c:Ljava/util/Map;

    sget-object v1, Lkik/a/d/a/a$c;->d:Lkik/a/d/a/a$c;

    const-string v2, "video/tinymp4"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Lkik/a/d/a/a;->c:Ljava/util/Map;

    sget-object v1, Lkik/a/d/a/a$c;->b:Lkik/a/d/a/a$c;

    const-string v2, "video/tinywebm"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Lkik/a/d/a/a;->c:Ljava/util/Map;

    sget-object v1, Lkik/a/d/a/a$c;->f:Lkik/a/d/a/a$c;

    const-string v2, "video/nanowebm"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Lkik/a/d/a/a;->c:Ljava/util/Map;

    sget-object v1, Lkik/a/d/a/a$c;->e:Lkik/a/d/a/a$c;

    const-string v2, "video/nanomp4"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 233
    const/16 v0, 0xf

    invoke-direct {p0, v1, v1, v0}, Lkik/a/d/a/g;-><init>(ZZI)V

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    .line 156
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    .line 157
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    .line 158
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    .line 234
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/d/a/a;->d:Ljava/lang/String;

    .line 235
    iput-object p1, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    .line 236
    const-string v0, "2"

    iput-object v0, p0, Lkik/a/d/a/a;->f:Ljava/lang/String;

    .line 238
    invoke-direct {p0}, Lkik/a/d/a/a;->B()V

    .line 239
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 243
    const/16 v0, 0xf

    invoke-direct {p0, v1, v1, v0}, Lkik/a/d/a/g;-><init>(ZZI)V

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    .line 156
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    .line 157
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    .line 158
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    .line 244
    iput-object p2, p0, Lkik/a/d/a/a;->d:Ljava/lang/String;

    .line 245
    iput-object p1, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    .line 246
    const-string v0, "2"

    iput-object v0, p0, Lkik/a/d/a/a;->f:Ljava/lang/String;

    .line 248
    invoke-direct {p0}, Lkik/a/d/a/a;->B()V

    .line 249
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/util/Hashtable;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 286
    const/16 v0, 0xf

    invoke-direct {p0, v1, v1, v0}, Lkik/a/d/a/g;-><init>(ZZI)V

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    .line 156
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    .line 157
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    .line 158
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    .line 288
    iput-object p2, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    .line 289
    iput-object p1, p0, Lkik/a/d/a/a;->d:Ljava/lang/String;

    .line 290
    iput-object p3, p0, Lkik/a/d/a/a;->f:Ljava/lang/String;

    .line 292
    if-nez p4, :cond_0

    .line 293
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 295
    :cond_0
    if-nez p7, :cond_1

    .line 296
    new-instance p7, Ljava/util/Hashtable;

    invoke-direct {p7}, Ljava/util/Hashtable;-><init>()V

    .line 298
    :cond_1
    if-nez p6, :cond_2

    .line 299
    new-instance p6, Ljava/util/Hashtable;

    invoke-direct {p6}, Ljava/util/Hashtable;-><init>()V

    .line 301
    :cond_2
    if-nez p5, :cond_3

    .line 302
    new-instance p5, Ljava/util/Hashtable;

    invoke-direct {p5}, Ljava/util/Hashtable;-><init>()V

    .line 305
    :cond_3
    iput-object p7, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    .line 306
    iput-object p6, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    .line 307
    iput-object p5, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    .line 308
    iput-object p4, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    .line 310
    invoke-direct {p0}, Lkik/a/d/a/a;->B()V

    .line 311
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 316
    const/16 v0, 0xf

    invoke-direct {p0, v1, v1, v0}, Lkik/a/d/a/g;-><init>(ZZI)V

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    .line 156
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    .line 157
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    .line 158
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    .line 318
    iput-object p2, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    .line 319
    iput-object p1, p0, Lkik/a/d/a/a;->d:Ljava/lang/String;

    .line 320
    iput-object p3, p0, Lkik/a/d/a/a;->f:Ljava/lang/String;

    .line 322
    iput-object p7, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    .line 336
    iput-object p6, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    .line 337
    iput-object p5, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    .line 338
    iput-object p4, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    .line 339
    iput-boolean p12, p0, Lkik/a/d/a/a;->h:Z

    .line 340
    iput-object p11, p0, Lkik/a/d/a/a;->g:Ljava/lang/String;

    .line 341
    iput-object p9, p0, Lkik/a/d/a/a;->n:Ljava/lang/String;

    .line 342
    iput-object p8, p0, Lkik/a/d/a/a;->m:Ljava/lang/String;

    .line 343
    iput-object p10, p0, Lkik/a/d/a/a;->o:Ljava/lang/String;

    .line 345
    invoke-direct {p0}, Lkik/a/d/a/a;->B()V

    .line 346
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/util/Hashtable;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 254
    const/16 v0, 0xf

    invoke-direct {p0, v1, v1, v0}, Lkik/a/d/a/g;-><init>(ZZI)V

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    .line 156
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    .line 157
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    .line 158
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    .line 256
    iput-object p2, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    .line 257
    iput-object p3, p0, Lkik/a/d/a/a;->f:Ljava/lang/String;

    .line 259
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 260
    :cond_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    .line 262
    :cond_1
    iput-object p1, p0, Lkik/a/d/a/a;->d:Ljava/lang/String;

    .line 264
    invoke-direct {p0, p4, p5}, Lkik/a/d/a/a;->a([Ljava/lang/String;[Ljava/lang/String;)V

    .line 265
    iput-object p8, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    .line 277
    iput-object p7, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    .line 278
    iput-object p6, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    .line 280
    invoke-direct {p0}, Lkik/a/d/a/a;->B()V

    .line 281
    return-void
.end method

.method public constructor <init>(Lkik/a/d/a/a;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 213
    const/16 v0, 0xf

    invoke-direct {p0, v1, v1, v0}, Lkik/a/d/a/g;-><init>(ZZI)V

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    .line 156
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    .line 157
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    .line 158
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    .line 215
    iget-object v0, p1, Lkik/a/d/a/a;->d:Ljava/lang/String;

    iput-object v0, p0, Lkik/a/d/a/a;->d:Ljava/lang/String;

    .line 216
    iget-object v0, p1, Lkik/a/d/a/a;->e:Ljava/lang/String;

    iput-object v0, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    .line 217
    iget-object v0, p1, Lkik/a/d/a/a;->f:Ljava/lang/String;

    iput-object v0, p0, Lkik/a/d/a/a;->f:Ljava/lang/String;

    .line 218
    iget-object v0, p1, Lkik/a/d/a/a;->g:Ljava/lang/String;

    iput-object v0, p0, Lkik/a/d/a/a;->g:Ljava/lang/String;

    .line 219
    iget-boolean v0, p1, Lkik/a/d/a/a;->h:Z

    iput-boolean v0, p0, Lkik/a/d/a/a;->h:Z

    .line 221
    iget-object v0, p1, Lkik/a/d/a/a;->m:Ljava/lang/String;

    iput-object v0, p0, Lkik/a/d/a/a;->m:Ljava/lang/String;

    .line 222
    iget-object v0, p1, Lkik/a/d/a/a;->n:Ljava/lang/String;

    iput-object v0, p0, Lkik/a/d/a/a;->n:Ljava/lang/String;

    .line 223
    iget-object v0, p1, Lkik/a/d/a/a;->o:Ljava/lang/String;

    iput-object v0, p0, Lkik/a/d/a/a;->o:Ljava/lang/String;

    .line 225
    iget-object v0, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    iget-object v1, p1, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 226
    iget-object v0, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    iget-object v1, p1, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->putAll(Ljava/util/Map;)V

    .line 227
    iget-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    iget-object v1, p1, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->putAll(Ljava/util/Map;)V

    .line 228
    iget-object v0, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    iget-object v1, p1, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->putAll(Ljava/util/Map;)V

    .line 229
    return-void
.end method

.method private B()V
    .locals 3

    .prologue
    .line 355
    invoke-direct {p0}, Lkik/a/d/a/a;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 356
    const-string v1, "app-name"

    sget-object v0, Lkik/a/d/a/a;->a:Ljava/util/Map;

    iget-object v2, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    :cond_0
    return-void
.end method

.method private C()Z
    .locals 2

    .prologue
    .line 498
    sget-object v0, Lkik/a/d/a/a;->b:Ljava/util/List;

    iget-object v1, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private D()Z
    .locals 3

    .prologue
    .line 569
    const-string v0, "true"

    iget-object v1, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    const-string v2, "needstranscoding"

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;Lkik/a/d/a/a$c;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 508
    invoke-virtual {p0}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v0

    .line 510
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    .line 511
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 512
    if-eqz p2, :cond_2

    .line 513
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->i()Ljava/lang/String;

    move-result-object v2

    .line 514
    invoke-static {p2}, Lkik/a/d/a/a;->c(Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v3

    .line 515
    if-eqz v2, :cond_1

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 516
    :cond_1
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    .line 525
    :goto_0
    return-object v0

    .line 520
    :cond_2
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 525
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a([Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 377
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    .line 378
    if-eqz p1, :cond_0

    .line 379
    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 380
    new-instance v1, Lcom/kik/f/a/a/a;

    aget-object v2, p1, v0

    iget-object v3, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    aget-object v2, p2, v0

    invoke-virtual {v1, v2}, Lcom/kik/f/a/a/a;->a(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 382
    iget-object v2, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 385
    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 204
    const-string v0, "com.kik.ext.video-camera"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.kik.ext.video-gallery"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    :cond_0
    const/4 v0, 0x0

    .line 208
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static c(Lkik/a/d/a/a$c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 530
    if-nez p0, :cond_0

    .line 531
    const/4 v0, 0x0

    .line 534
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lkik/a/d/a/a;->c:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0
.end method

.method private static m(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 771
    if-nez p0, :cond_0

    .line 772
    const-string p0, "null"

    .line 775
    :cond_0
    return-object p0
.end method

.method private n(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 900
    invoke-virtual {p0, p1}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 901
    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 902
    const/4 v0, 0x0

    .line 905
    :goto_0
    return v0

    :cond_0
    const-string v1, "true"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .prologue
    .line 893
    const-string v0, "video-should-be-muted"

    invoke-direct {p0, v0}, Lkik/a/d/a/a;->n(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lkik/a/d/a/a;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final a(J)Ljava/lang/String;
    .locals 3

    .prologue
    .line 915
    iget-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    const-string v1, "duration"

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final a(Lkik/a/d/a/a$c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 441
    iget-object v0, p0, Lkik/a/d/a/a;->n:Ljava/lang/String;

    .line 442
    if-nez v0, :cond_0

    .line 443
    const-string v0, "file-url"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 444
    if-nez v0, :cond_0

    .line 445
    const-string v0, "video"

    invoke-direct {p0, v0, p1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v0

    .line 448
    :cond_0
    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lkik/a/d/o;
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/o;

    return-object v0
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 820
    sget-object v0, Lkik/a/d/a/a$1;->a:[I

    add-int/lit8 v1, p1, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 835
    :goto_0
    return-void

    .line 822
    :pswitch_0
    const-string v0, "int-file-state"

    const-string v1, "1"

    invoke-virtual {p0, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 826
    :pswitch_1
    const-string v0, "int-file-state"

    const-string v1, "0"

    invoke-virtual {p0, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 829
    :pswitch_2
    const-string v0, "int-file-state"

    const-string v1, "-1"

    invoke-virtual {p0, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 832
    :pswitch_3
    iget-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    const-string v1, "int-file-state"

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 820
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final a(Ljava/io/File;)V
    .locals 4

    .prologue
    .line 549
    if-nez p1, :cond_0

    .line 555
    :goto_0
    return-void

    .line 552
    :cond_0
    const-string v0, "int-file-url-local"

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 553
    const-string v0, "file-name"

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    const-string v0, "file-size"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 668
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 669
    iget-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 715
    new-instance v0, Lcom/kik/f/a/a/a;

    iget-object v1, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 716
    invoke-virtual {v0, p2}, Lcom/kik/f/a/a/a;->a(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 717
    invoke-virtual {v0, p3}, Lcom/kik/f/a/a/a;->b(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 718
    invoke-virtual {v0, p4}, Lcom/kik/f/a/a/a;->c(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 719
    invoke-virtual {v0, p5}, Lcom/kik/f/a/a/a;->e(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 720
    iget-object v1, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 721
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lkik/a/d/a/a$c;)V
    .locals 2

    .prologue
    .line 725
    new-instance v0, Lcom/kik/f/a/a/a;

    iget-object v1, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 726
    invoke-static {p3}, Lkik/a/d/a/a;->c(Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/f/a/a/a;->e(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 727
    invoke-virtual {v0, p2}, Lcom/kik/f/a/a/a;->b(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 728
    iget-object v1, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 729
    return-void
.end method

.method public final a(Ljava/lang/String;Lkik/a/d/o;)V
    .locals 1

    .prologue
    .line 701
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 702
    iget-object v0, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 704
    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 559
    if-eqz p1, :cond_0

    .line 560
    const-string v0, "needstranscoding"

    const-string v1, "true"

    invoke-virtual {p0, v0, v1}, Lkik/a/d/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 565
    :goto_0
    return-void

    .line 563
    :cond_0
    const-string v0, "needstranscoding"

    const-string v1, "false"

    invoke-virtual {p0, v0, v1}, Lkik/a/d/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lkik/a/d/a/a;->o:Ljava/lang/String;

    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 708
    new-instance v0, Lcom/kik/f/a/a/a;

    iget-object v1, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 709
    invoke-virtual {v0, p2}, Lcom/kik/f/a/a/a;->a(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 710
    iget-object v1, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 711
    return-void
.end method

.method public final b(Lkik/a/d/a/a$c;)Z
    .locals 4

    .prologue
    .line 453
    invoke-virtual {p0}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v0

    .line 455
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    .line 456
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    const-string v3, "video"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 457
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->i()Ljava/lang/String;

    move-result-object v0

    .line 458
    invoke-static {p1}, Lkik/a/d/a/a;->c(Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v2

    .line 459
    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    .line 460
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 463
    const/4 v0, 0x1

    .line 469
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c(Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .prologue
    .line 400
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 401
    invoke-virtual {p0}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v0

    .line 403
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    .line 404
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v3

    const-string v4, "cards"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 405
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 409
    :cond_2
    return-object v1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 738
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 739
    iget-object v0, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 742
    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 362
    iget-object v0, p0, Lkik/a/d/a/a;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 367
    iget-object v0, p0, Lkik/a/d/a/a;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 479
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v0

    .line 480
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e(Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .prologue
    .line 607
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 608
    invoke-virtual {p0}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v0

    .line 610
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    .line 612
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v3

    const-string v4, "cards"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 613
    :cond_1
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 617
    :cond_2
    return-object v1
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 372
    iget-boolean v0, p0, Lkik/a/d/a/a;->h:Z

    return v0
.end method

.method public final f()Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 390
    iget-object v0, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public final f(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 632
    iput-object p1, p0, Lkik/a/d/a/a;->d:Ljava/lang/String;

    .line 633
    return-void
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    .prologue
    .line 418
    iget-object v0, p0, Lkik/a/d/a/a;->n:Ljava/lang/String;

    .line 419
    if-nez v0, :cond_0

    .line 420
    const-string v0, "file-url"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 421
    if-nez v0, :cond_0

    .line 422
    const-string v0, "image"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v0

    .line 425
    :cond_0
    return-object v0
.end method

.method public final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 642
    iget-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 430
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->a(Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 647
    iget-object v0, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final i(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 858
    const-string v0, "disallow-save"

    invoke-virtual {p0, v0, p1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 859
    return-void
.end method

.method public final i()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 485
    iget-object v1, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    const-string v2, "file-url"

    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 488
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lkik/a/d/a/a;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lkik/a/d/a/a;->C()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final j(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 863
    const-string v0, "video-should-autoplay"

    invoke-virtual {p0, v0, p1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 864
    return-void
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 493
    invoke-virtual {p0}, Lkik/a/d/a/a;->i()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.kik.ext.gif"

    iget-object v1, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final k()Ljava/io/File;
    .locals 2

    .prologue
    .line 539
    const-string v0, "int-file-url-local"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 540
    if-eqz v1, :cond_0

    .line 541
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 544
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final k(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 868
    const-string v0, "video-should-loop"

    invoke-virtual {p0, v0, p1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 869
    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 873
    const-string v0, "video-should-be-muted"

    invoke-virtual {p0, v0, p1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 874
    return-void
.end method

.method public final l()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 578
    invoke-virtual {p0}, Lkik/a/d/a/a;->v()I

    move-result v0

    sget v3, Lkik/a/d/a/a$a;->a:I

    if-ne v0, v3, :cond_0

    move v0, v1

    .line 579
    :goto_0
    invoke-direct {p0}, Lkik/a/d/a/a;->D()Z

    move-result v3

    if-eqz v3, :cond_1

    if-nez v0, :cond_1

    :goto_1
    return v1

    :cond_0
    move v0, v2

    .line 578
    goto :goto_0

    :cond_1
    move v1, v2

    .line 579
    goto :goto_1
.end method

.method public final m()Ljava/util/ArrayList;
    .locals 5

    .prologue
    .line 589
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 590
    invoke-virtual {p0}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v0

    .line 591
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    .line 592
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v3

    const-string v4, "cards"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 593
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 597
    :cond_1
    return-object v1
.end method

.method public final n()Z
    .locals 1

    .prologue
    .line 622
    const-string v0, "png-preview"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    .prologue
    .line 627
    iget-object v0, p0, Lkik/a/d/a/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    .prologue
    .line 637
    iget-object v0, p0, Lkik/a/d/a/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final q()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 652
    iget-object v0, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    return-object v0
.end method

.method public final r()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 657
    iget-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    return-object v0
.end method

.method public final s()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 663
    iget-object v0, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    return-object v0
.end method

.method public final t()Lkik/a/d/a/a$b;
    .locals 2

    .prologue
    .line 681
    iget-object v0, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    const-string v1, "layout"

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 683
    if-eqz v0, :cond_0

    sget-object v1, Lkik/a/d/a/a$b;->a:Lkik/a/d/a/a$b;

    iget-object v1, v1, Lkik/a/d/a/a$b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 684
    :cond_0
    sget-object v0, Lkik/a/d/a/a$b;->a:Lkik/a/d/a/a$b;

    .line 696
    :goto_0
    return-object v0

    .line 686
    :cond_1
    sget-object v1, Lkik/a/d/a/a$b;->c:Lkik/a/d/a/a$b;

    iget-object v1, v1, Lkik/a/d/a/a$b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 687
    sget-object v0, Lkik/a/d/a/a$b;->c:Lkik/a/d/a/a$b;

    goto :goto_0

    .line 689
    :cond_2
    sget-object v1, Lkik/a/d/a/a$b;->b:Lkik/a/d/a/a$b;

    iget-object v1, v1, Lkik/a/d/a/a$b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 690
    sget-object v0, Lkik/a/d/a/a$b;->b:Lkik/a/d/a/a$b;

    goto :goto_0

    .line 692
    :cond_3
    sget-object v1, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    iget-object v1, v1, Lkik/a/d/a/a$b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 693
    sget-object v0, Lkik/a/d/a/a$b;->e:Lkik/a/d/a/a$b;

    goto :goto_0

    .line 696
    :cond_4
    sget-object v0, Lkik/a/d/a/a$b;->a:Lkik/a/d/a/a$b;

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    .line 746
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "appId: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    invoke-static {v1}, Lkik/a/d/a/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " _contentId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lkik/a/d/a/a;->d:Ljava/lang/String;

    invoke-static {v1}, Lkik/a/d/a/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " strings: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 747
    iget-object v2, p0, Lkik/a/d/a/a;->k:Ljava/util/Hashtable;

    .line 748
    invoke-virtual {v2}, Ljava/util/Hashtable;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 749
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 750
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "("

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ","

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v2, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "),"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 751
    goto :goto_0

    .line 752
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " extras: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 753
    iget-object v2, p0, Lkik/a/d/a/a;->j:Ljava/util/Hashtable;

    .line 754
    invoke-virtual {v2}, Ljava/util/Hashtable;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 755
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v1, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 756
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "("

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ","

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v2, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 757
    goto :goto_1

    .line 758
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " images: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 759
    iget-object v3, p0, Lkik/a/d/a/a;->l:Ljava/util/Hashtable;

    .line 760
    invoke-virtual {v3}, Ljava/util/Hashtable;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 761
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v2, v0

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 762
    invoke-virtual {v3, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/o;

    .line 763
    invoke-virtual {v1}, Lkik/a/d/o;->c()[B

    move-result-object v1

    .line 764
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "("

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-nez v1, :cond_2

    const-string v0, "null"

    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 765
    goto :goto_2

    .line 764
    :cond_2
    array-length v0, v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 766
    :cond_3
    return-object v2
.end method

.method public final u()Ljava/lang/String;
    .locals 1

    .prologue
    .line 733
    iget-object v0, p0, Lkik/a/d/a/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final v()I
    .locals 2

    .prologue
    .line 801
    const-string v0, "int-file-state"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 802
    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 803
    sget v0, Lkik/a/d/a/a$a;->e:I

    .line 815
    :goto_0
    return v0

    .line 805
    :cond_0
    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 806
    sget v0, Lkik/a/d/a/a$a;->a:I

    goto :goto_0

    .line 808
    :cond_1
    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 809
    invoke-direct {p0}, Lkik/a/d/a/a;->D()Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lkik/a/d/a/a$a;->c:I

    goto :goto_0

    :cond_2
    sget v0, Lkik/a/d/a/a$a;->b:I

    goto :goto_0

    .line 811
    :cond_3
    const-string v1, "-1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 812
    sget v0, Lkik/a/d/a/a$a;->d:I

    goto :goto_0

    .line 815
    :cond_4
    sget v0, Lkik/a/d/a/a$a;->d:I

    goto :goto_0
.end method

.method public final w()I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 843
    const-string v1, "file-size"

    invoke-virtual {p0, v1}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 844
    invoke-static {v1}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 852
    :goto_0
    return v0

    .line 849
    :cond_0
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 852
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public final x()Z
    .locals 1

    .prologue
    .line 878
    const-string v0, "disallow-save"

    invoke-direct {p0, v0}, Lkik/a/d/a/a;->n(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final y()Z
    .locals 1

    .prologue
    .line 883
    const-string v0, "video-should-autoplay"

    invoke-direct {p0, v0}, Lkik/a/d/a/a;->n(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final z()Z
    .locals 1

    .prologue
    .line 888
    const-string v0, "video-should-loop"

    invoke-direct {p0, v0}, Lkik/a/d/a/a;->n(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

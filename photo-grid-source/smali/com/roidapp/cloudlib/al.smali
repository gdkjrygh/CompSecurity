.class public final Lcom/roidapp/cloudlib/al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/aj;


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field private static g:Lcom/roidapp/cloudlib/al;


# instance fields
.field private h:Lcom/roidapp/cloudlib/aj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 78
    const-string v0, "http://dl.pg.ksmobile.com/conf"

    sput-object v0, Lcom/roidapp/cloudlib/al;->a:Ljava/lang/String;

    .line 86
    const-string v0, "http://dl.pg.ksmobile.com/templates/everyday"

    sput-object v0, Lcom/roidapp/cloudlib/al;->b:Ljava/lang/String;

    .line 101
    const-string v0, "http://dl.pg.ksmobile.com/filter2/info"

    sput-object v0, Lcom/roidapp/cloudlib/al;->c:Ljava/lang/String;

    .line 107
    const-string v0, "http://dl.pg.ksmobile.com/ga/web/cdn.php?path=/templete/getTemplateFromPicNum&picnum=%s"

    sput-object v0, Lcom/roidapp/cloudlib/al;->d:Ljava/lang/String;

    .line 112
    const-string v0, "http://dl.pg.ksmobile.com/cloudpush/info_v2"

    sput-object v0, Lcom/roidapp/cloudlib/al;->e:Ljava/lang/String;

    .line 117
    const-string v0, "http://wide.adr.pt.ksmobile.com/api/emoji_json"

    sput-object v0, Lcom/roidapp/cloudlib/al;->f:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    return-void
.end method

.method public static g()Lcom/roidapp/cloudlib/al;
    .locals 1

    .prologue
    .line 144
    sget-object v0, Lcom/roidapp/cloudlib/al;->g:Lcom/roidapp/cloudlib/al;

    if-nez v0, :cond_0

    .line 145
    new-instance v0, Lcom/roidapp/cloudlib/al;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/al;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/al;->g:Lcom/roidapp/cloudlib/al;

    .line 147
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/al;->g:Lcom/roidapp/cloudlib/al;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2, p3}, Lcom/roidapp/cloudlib/aj;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/content/Context;I)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/cloudlib/aj;->a(Landroid/content/Context;I)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;I)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 241
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2, p3}, Lcom/roidapp/cloudlib/aj;->a(Landroid/content/Context;Ljava/lang/String;I)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 160
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/aj;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 277
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/aj;->a(Landroid/app/Activity;)V

    .line 278
    return-void
.end method

.method public final a(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/cloudlib/aj;->a(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 262
    return-void
.end method

.method public final a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/aj;->a(Landroid/content/Context;)V

    .line 153
    return-void
.end method

.method public final a(Landroid/content/Context;ILjava/lang/String;)V
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2, p3}, Lcom/roidapp/cloudlib/aj;->a(Landroid/content/Context;ILjava/lang/String;)V

    .line 157
    return-void
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/cloudlib/aj;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 183
    return-void
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 7

    .prologue
    .line 185
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v6}, Lcom/roidapp/cloudlib/aj;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V

    .line 186
    return-void
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 189
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/roidapp/cloudlib/aj;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V

    .line 190
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/aj;)V
    .locals 0

    .prologue
    .line 140
    iput-object p1, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    .line 141
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/aj;->a(Ljava/lang/String;)V

    .line 198
    return-void
.end method

.method public final a(Ljava/lang/String;II)V
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2, p3}, Lcom/roidapp/cloudlib/aj;->a(Ljava/lang/String;II)V

    .line 281
    return-void
.end method

.method public final a(Landroid/os/Bundle;)Z
    .locals 1

    .prologue
    .line 221
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/aj;->a(Landroid/os/Bundle;)Z

    move-result v0

    return v0
.end method

.method public final a(Landroid/content/Context;Landroid/net/Uri;Z)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2, p3}, Lcom/roidapp/cloudlib/aj;->a(Landroid/content/Context;Landroid/net/Uri;Z)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/aj;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/content/Context;)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/aj;->b(Landroid/content/Context;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 169
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/aj;->b()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/cloudlib/aj;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 194
    return-void
.end method

.method public final c(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/cloudlib/aj;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 173
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/aj;->c()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final c(Landroid/content/Context;)Z
    .locals 1

    .prologue
    .line 249
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/aj;->c(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public final d(Landroid/content/Context;Ljava/lang/String;)Lcom/roidapp/cloudlib/ads/l;
    .locals 1

    .prologue
    .line 265
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/cloudlib/aj;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/roidapp/cloudlib/ads/l;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 178
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/aj;->d()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final d(Landroid/content/Context;)Z
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/aj;->d(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 295
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/cloudlib/aj;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/cloudlib/ak;",
            ">;"
        }
    .end annotation

    .prologue
    .line 213
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/aj;->e()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final e(Landroid/content/Context;)Z
    .locals 1

    .prologue
    .line 269
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/aj;->e(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 245
    iget-object v0, p0, Lcom/roidapp/cloudlib/al;->h:Lcom/roidapp/cloudlib/aj;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/aj;->f()Z

    move-result v0

    return v0
.end method

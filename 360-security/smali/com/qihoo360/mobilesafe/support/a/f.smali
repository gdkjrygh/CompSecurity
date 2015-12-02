.class public Lcom/qihoo360/mobilesafe/support/a/f;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/support/a/b;


# instance fields
.field private a:Lcom/qihoo360/mobilesafe/support/a/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo360/mobilesafe/support/a/b;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    .line 27
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qihoo360/mobilesafe/support/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-eqz v0, :cond_1

    .line 98
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/f$1;

    invoke-direct {v0, p0, p4}, Lcom/qihoo360/mobilesafe/support/a/f$1;-><init>(Lcom/qihoo360/mobilesafe/support/a/f;Lcom/qihoo360/mobilesafe/support/a/a;)V

    .line 108
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1, p1, p2, p3, v0}, Lcom/qihoo360/mobilesafe/support/a/b;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    :cond_0
    :goto_0
    return-void

    .line 109
    :catch_0
    move-exception v0

    .line 110
    if-eqz p4, :cond_0

    .line 112
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_1
    invoke-interface {p4, v0, v1, v2}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 113
    :catch_1
    move-exception v0

    goto :goto_0

    .line 117
    :cond_1
    if-eqz p4, :cond_0

    .line 119
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_2
    invoke-interface {p4, v0, v1, v2}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    .line 120
    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method public a()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 161
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v1, :cond_0

    .line 171
    :goto_0
    return v0

    .line 165
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1}, Lcom/qihoo360/mobilesafe/support/a/b;->a()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 166
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(IIJ)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 268
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v1, :cond_1

    .line 278
    :cond_0
    :goto_0
    return v0

    .line 272
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1, p1, p2, p3, p4}, Lcom/qihoo360/mobilesafe/support/a/b;->a(IIJ)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 276
    :goto_1
    if-nez v0, :cond_0

    .line 277
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/f;->e()V

    goto :goto_0

    .line 273
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public a(J)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 181
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v1, :cond_0

    .line 190
    :goto_0
    return v0

    .line 185
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1, p1, p2}, Lcom/qihoo360/mobilesafe/support/a/b;->a(J)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 186
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Ljava/lang/String;IIJ)Z
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 253
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v0, :cond_1

    move v0, v6

    .line 263
    :cond_0
    :goto_0
    return v0

    .line 257
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/b;->a(Ljava/lang/String;IIJ)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 261
    :goto_1
    if-nez v0, :cond_0

    .line 262
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/f;->e()V

    goto :goto_0

    .line 258
    :catch_0
    move-exception v0

    move v0, v6

    .line 259
    goto :goto_1
.end method

.method public a(Ljava/lang/String;IJ)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 223
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v1, :cond_1

    .line 233
    :cond_0
    :goto_0
    return v0

    .line 227
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1, p1, p2, p3, p4}, Lcom/qihoo360/mobilesafe/support/a/b;->a(Ljava/lang/String;IJ)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 231
    :goto_1
    if-nez v0, :cond_0

    .line 232
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/f;->e()V

    goto :goto_0

    .line 228
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public a(Ljava/lang/String;J)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 238
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v1, :cond_1

    .line 248
    :cond_0
    :goto_0
    return v0

    .line 242
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1, p1, p2, p3}, Lcom/qihoo360/mobilesafe/support/a/b;->a(Ljava/lang/String;J)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 246
    :goto_1
    if-nez v0, :cond_0

    .line 247
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/f;->e()V

    goto :goto_0

    .line 243
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 283
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v1, :cond_1

    .line 293
    :cond_0
    :goto_0
    return v0

    .line 287
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1, p1, p2, p3, p4}, Lcom/qihoo360/mobilesafe/support/a/b;->a(Ljava/lang/String;Ljava/lang/String;J)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 291
    :goto_1
    if-nez v0, :cond_0

    .line 292
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/f;->e()V

    goto :goto_0

    .line 288
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Z
    .locals 9

    .prologue
    .line 298
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v0, :cond_1

    .line 299
    const/4 v0, 0x0

    .line 308
    :cond_0
    :goto_0
    return v0

    .line 302
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    move-object v6, p6

    move-wide/from16 v7, p7

    invoke-interface/range {v0 .. v8}, Lcom/qihoo360/mobilesafe/support/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 306
    :goto_1
    if-nez v0, :cond_0

    .line 307
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/f;->e()V

    goto :goto_0

    .line 303
    :catch_0
    move-exception v0

    .line 304
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J)Z"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 52
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v0, :cond_1

    move v0, v6

    .line 62
    :cond_0
    :goto_0
    return v0

    .line 56
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/b;->a(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 60
    :goto_1
    if-nez v0, :cond_0

    .line 61
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/f;->e()V

    goto :goto_0

    .line 57
    :catch_0
    move-exception v0

    move v0, v6

    .line 58
    goto :goto_1
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J)I"
        }
    .end annotation

    .prologue
    const/4 v6, -0x1

    .line 66
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v0, :cond_1

    move v0, v6

    .line 76
    :cond_0
    :goto_0
    return v0

    .line 70
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/b;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 74
    :goto_1
    if-ne v0, v6, :cond_0

    .line 75
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/f;->e()V

    goto :goto_0

    .line 71
    :catch_0
    move-exception v0

    move v0, v6

    goto :goto_1
.end method

.method public b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qihoo360/mobilesafe/support/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 128
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-eqz v0, :cond_1

    .line 129
    new-instance v0, Lcom/qihoo360/mobilesafe/support/a/f$2;

    invoke-direct {v0, p0, p4}, Lcom/qihoo360/mobilesafe/support/a/f$2;-><init>(Lcom/qihoo360/mobilesafe/support/a/f;Lcom/qihoo360/mobilesafe/support/a/a;)V

    .line 139
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1, p1, p2, p3, v0}, Lcom/qihoo360/mobilesafe/support/a/b;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    :cond_0
    :goto_0
    return-void

    .line 140
    :catch_0
    move-exception v0

    .line 141
    if-eqz p4, :cond_0

    .line 143
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_1
    invoke-interface {p4, v0, v1, v2}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 144
    :catch_1
    move-exception v0

    goto :goto_0

    .line 148
    :cond_1
    if-eqz p4, :cond_0

    .line 150
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_2
    invoke-interface {p4, v0, v1, v2}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    .line 151
    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method public b()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 195
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v1, :cond_0

    .line 204
    :goto_0
    return v0

    .line 199
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1}, Lcom/qihoo360/mobilesafe/support/a/b;->b()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 200
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public c()I
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 209
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v1, :cond_1

    .line 218
    :cond_0
    :goto_0
    return v0

    .line 213
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    invoke-interface {v1}, Lcom/qihoo360/mobilesafe/support/a/b;->c()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 216
    :goto_1
    if-gez v0, :cond_0

    .line 217
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/f;->e()V

    goto :goto_0

    .line 214
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;J)[B"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 81
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    if-nez v0, :cond_1

    move-object v0, v6

    .line 91
    :cond_0
    :goto_0
    return-object v0

    .line 85
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/support/a/b;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)[B
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 89
    :goto_1
    if-nez v0, :cond_0

    .line 90
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/support/a/f;->e()V

    goto :goto_0

    .line 86
    :catch_0
    move-exception v0

    move-object v0, v6

    .line 87
    goto :goto_1
.end method

.method public d()Lcom/qihoo360/mobilesafe/support/a/b;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f;->a:Lcom/qihoo360/mobilesafe/support/a/b;

    return-object v0
.end method

.method public e()V
    .locals 0

    .prologue
    .line 48
    return-void
.end method

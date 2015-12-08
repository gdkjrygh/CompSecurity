.class Lcom/jirbo/adcolony/ADCData$c;
.super Lcom/jirbo/adcolony/ADCData$i;
.source "SourceFile"


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/ADCData$i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 295
    invoke-direct {p0}, Lcom/jirbo/adcolony/ADCData$i;-><init>()V

    .line 297
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method a(ID)D
    .locals 2

    .prologue
    .line 378
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    .line 379
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->d()D

    move-result-wide p2

    .line 380
    :cond_0
    return-wide p2
.end method

.method a(II)I
    .locals 2

    .prologue
    .line 385
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    .line 386
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->e()I

    move-result p2

    .line 387
    :cond_0
    return p2
.end method

.method a(D)Lcom/jirbo/adcolony/ADCData$c;
    .locals 1

    .prologue
    .line 342
    new-instance v0, Lcom/jirbo/adcolony/ADCData$e;

    invoke-direct {v0, p1, p2}, Lcom/jirbo/adcolony/ADCData$e;-><init>(D)V

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;

    return-object p0
.end method

.method a(I)Lcom/jirbo/adcolony/ADCData$c;
    .locals 1

    .prologue
    .line 343
    new-instance v0, Lcom/jirbo/adcolony/ADCData$b;

    invoke-direct {v0, p1}, Lcom/jirbo/adcolony/ADCData$b;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;

    return-object p0
.end method

.method a(ILcom/jirbo/adcolony/ADCData$c;)Lcom/jirbo/adcolony/ADCData$c;
    .locals 2

    .prologue
    .line 364
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    .line 365
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->h()Lcom/jirbo/adcolony/ADCData$c;

    move-result-object p2

    .line 366
    :cond_0
    return-object p2
.end method

.method a(Lcom/jirbo/adcolony/ADCData$c;)Lcom/jirbo/adcolony/ADCData$c;
    .locals 2

    .prologue
    .line 348
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Lcom/jirbo/adcolony/ADCData$c;->i()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 350
    iget-object v0, p1, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;

    .line 348
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 352
    :cond_0
    return-object p0
.end method

.method a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;
    .locals 1

    .prologue
    .line 340
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method a(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$c;
    .locals 1

    .prologue
    .line 341
    new-instance v0, Lcom/jirbo/adcolony/ADCData$f;

    invoke-direct {v0, p1}, Lcom/jirbo/adcolony/ADCData$f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;

    return-object p0
.end method

.method a(Z)Lcom/jirbo/adcolony/ADCData$c;
    .locals 1

    .prologue
    .line 344
    if-eqz p1, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/ADCData;->a:Lcom/jirbo/adcolony/ADCData$i;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;

    return-object p0

    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/ADCData;->b:Lcom/jirbo/adcolony/ADCData$i;

    goto :goto_0
.end method

.method a(ILcom/jirbo/adcolony/ADCData$g;)Lcom/jirbo/adcolony/ADCData$g;
    .locals 2

    .prologue
    .line 357
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    .line 358
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->n()Lcom/jirbo/adcolony/ADCData$g;

    move-result-object p2

    .line 359
    :cond_0
    return-object p2
.end method

.method a(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 371
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    .line 372
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->b()Ljava/lang/String;

    move-result-object p2

    .line 373
    :cond_0
    return-object p2
.end method

.method a(Lcom/jirbo/adcolony/af;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 305
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 307
    if-nez v4, :cond_0

    .line 309
    const-string v0, "[]"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    .line 334
    :goto_0
    return-void

    .line 311
    :cond_0
    if-ne v4, v1, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    const-string v0, "["

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    .line 314
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCData$i;->a(Lcom/jirbo/adcolony/af;)V

    .line 315
    const-string v0, "]"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 319
    :cond_1
    const-string v0, "["

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->b(Ljava/lang/String;)V

    .line 320
    iget v0, p1, Lcom/jirbo/adcolony/af;->i:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p1, Lcom/jirbo/adcolony/af;->i:I

    move v3, v2

    move v0, v1

    .line 323
    :goto_1
    if-ge v3, v4, :cond_3

    .line 325
    if-eqz v0, :cond_2

    move v1, v2

    .line 327
    :goto_2
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCData$i;->a(Lcom/jirbo/adcolony/af;)V

    .line 323
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    move v0, v1

    goto :goto_1

    .line 326
    :cond_2
    const/16 v1, 0x2c

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/af;->c(C)V

    move v1, v0

    goto :goto_2

    .line 329
    :cond_3
    invoke-virtual {p1}, Lcom/jirbo/adcolony/af;->d()V

    .line 331
    iget v0, p1, Lcom/jirbo/adcolony/af;->i:I

    add-int/lit8 v0, v0, -0x2

    iput v0, p1, Lcom/jirbo/adcolony/af;->i:I

    .line 332
    const-string v0, "]"

    invoke-virtual {p1, v0}, Lcom/jirbo/adcolony/af;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method a(IZ)Z
    .locals 2

    .prologue
    .line 392
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    .line 393
    if-eqz v0, :cond_1

    .line 395
    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->a()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->l()Z

    move-result p2

    .line 397
    :cond_1
    return p2
.end method

.method a_()Lcom/jirbo/adcolony/ADCData$i;
    .locals 2

    .prologue
    .line 421
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    return-object v0
.end method

.method b(I)Lcom/jirbo/adcolony/ADCData$g;
    .locals 1

    .prologue
    .line 402
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(ILcom/jirbo/adcolony/ADCData$g;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v0

    .line 403
    if-eqz v0, :cond_0

    .line 404
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    goto :goto_0
.end method

.method c(I)Lcom/jirbo/adcolony/ADCData$c;
    .locals 1

    .prologue
    .line 409
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(ILcom/jirbo/adcolony/ADCData$c;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v0

    .line 410
    if-eqz v0, :cond_0

    .line 411
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/jirbo/adcolony/ADCData$c;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$c;-><init>()V

    goto :goto_0
.end method

.method d(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 414
    const-string v0, ""

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method e(I)D
    .locals 2

    .prologue
    .line 415
    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/jirbo/adcolony/ADCData$c;->a(ID)D

    move-result-wide v0

    return-wide v0
.end method

.method f(I)I
    .locals 1

    .prologue
    .line 416
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(II)I

    move-result v0

    return v0
.end method

.method f()Z
    .locals 1

    .prologue
    .line 299
    const/4 v0, 0x1

    return v0
.end method

.method g()Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 300
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCData$i;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$i;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v2

    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method g(I)Z
    .locals 1

    .prologue
    .line 417
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/ADCData$c;->a(IZ)Z

    move-result v0

    return v0
.end method

.method h()Lcom/jirbo/adcolony/ADCData$c;
    .locals 0

    .prologue
    .line 301
    return-object p0
.end method

.method i()I
    .locals 1

    .prologue
    .line 336
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method j()V
    .locals 1

    .prologue
    .line 338
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCData$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

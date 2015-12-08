.class final Lcom/roidapp/photogrid/cloud/ce;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public a:Z

.field final synthetic b:Lcom/roidapp/photogrid/cloud/br;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/cloud/br;)V
    .locals 1

    .prologue
    .line 1361
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1363
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/ce;->a:Z

    .line 1364
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    .line 1365
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/br;B)V
    .locals 0

    .prologue
    .line 1361
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/ce;-><init>(Lcom/roidapp/photogrid/cloud/br;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 1369
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/ce;->a:Z

    .line 1370
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    .line 1371
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    .line 1372
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->q(Lcom/roidapp/photogrid/cloud/br;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1373
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->k()Z

    .line 1374
    return-void
.end method

.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .prologue
    .line 1475
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/c/n;->c(Ljava/lang/String;)Z

    move-result v0

    .line 1476
    if-eqz v0, :cond_0

    .line 1477
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070188

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " 30"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Ljava/lang/String;)V

    .line 1478
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->f(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1479
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->f(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/EditText;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/br;->r(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/ce;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1480
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->f(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    iget v2, p0, Lcom/roidapp/photogrid/cloud/ce;->e:I

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v1, v2, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 1481
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->f(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->r(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/ce;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1485
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/cloud/br;->b(Lcom/roidapp/photogrid/cloud/br;Ljava/lang/String;)V

    .line 1486
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .prologue
    .line 1378
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/ce;->e:I

    .line 1379
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1f4

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v2, -0x1

    const/16 v3, 0x3e9

    .line 1383
    iget v0, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    if-ne v0, v2, :cond_0

    .line 1384
    iput p2, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    .line 1387
    :cond_0
    if-lez p4, :cond_8

    .line 1388
    add-int v0, p2, p4

    invoke-interface {p1, p2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1389
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/ce;->a:Z

    if-eqz v1, :cond_7

    .line 1390
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1391
    iput-boolean v4, p0, Lcom/roidapp/photogrid/cloud/ce;->a:Z

    .line 1392
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    .line 1393
    iput v2, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    .line 1394
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->q(Lcom/roidapp/photogrid/cloud/br;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1395
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->k()Z

    .line 1471
    :cond_1
    :goto_0
    return-void

    .line 1398
    :cond_2
    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1399
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    .line 1400
    iput v2, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    .line 1401
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->q(Lcom/roidapp/photogrid/cloud/br;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_0

    .line 1404
    :cond_3
    if-ne p4, v5, :cond_5

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 1405
    if-le p3, v5, :cond_4

    .line 1406
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    .line 1421
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ltz v0, :cond_1

    .line 1422
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1423
    iput v3, v0, Landroid/os/Message;->what:I

    .line 1424
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1425
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->q(Lcom/roidapp/photogrid/cloud/br;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1426
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->q(Lcom/roidapp/photogrid/cloud/br;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0, v6, v7}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 1408
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    goto :goto_1

    .line 1411
    :cond_5
    if-nez p3, :cond_6

    .line 1412
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    goto :goto_1

    .line 1414
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1415
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    goto :goto_1

    .line 1430
    :cond_7
    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1431
    iput-boolean v5, p0, Lcom/roidapp/photogrid/cloud/ce;->a:Z

    .line 1432
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    .line 1433
    iput p2, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    goto/16 :goto_0

    .line 1439
    :cond_8
    iget v0, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    if-ne v0, p2, :cond_9

    .line 1440
    iput-boolean v4, p0, Lcom/roidapp/photogrid/cloud/ce;->a:Z

    .line 1441
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    .line 1442
    iput v2, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    .line 1443
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->q(Lcom/roidapp/photogrid/cloud/br;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1444
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->k()Z

    goto/16 :goto_0

    .line 1447
    :cond_9
    iget v0, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    add-int/lit8 v0, v0, 0x1

    if-le v0, p2, :cond_a

    .line 1448
    iput-boolean v4, p0, Lcom/roidapp/photogrid/cloud/ce;->a:Z

    .line 1449
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    .line 1450
    iput v2, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    .line 1451
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->q(Lcom/roidapp/photogrid/cloud/br;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1452
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->k()Z

    goto/16 :goto_0

    .line 1455
    :cond_a
    iget v0, p0, Lcom/roidapp/photogrid/cloud/ce;->d:I

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1456
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/ce;->a:Z

    if-eqz v1, :cond_1

    .line 1457
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 1458
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    .line 1460
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ltz v0, :cond_1

    .line 1461
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1462
    iput v3, v0, Landroid/os/Message;->what:I

    .line 1463
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->c:Ljava/lang/String;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1464
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->q(Lcom/roidapp/photogrid/cloud/br;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1465
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ce;->b:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->q(Lcom/roidapp/photogrid/cloud/br;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0, v6, v7}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_0
.end method

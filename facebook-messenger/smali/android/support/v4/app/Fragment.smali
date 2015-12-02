.class public Landroid/support/v4/app/Fragment;
.super Ljava/lang/Object;
.source "Fragment.java"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;


# static fields
.field private static final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<*>;>;"
        }
    .end annotation
.end field


# instance fields
.field A:Z

.field B:I

.field C:Landroid/support/v4/app/s;

.field D:Landroid/support/v4/app/p;

.field E:Landroid/support/v4/app/s;

.field F:Landroid/support/v4/app/Fragment;

.field G:I

.field H:I

.field I:Ljava/lang/String;

.field J:Z

.field K:Z

.field L:Z

.field M:Z

.field N:Z

.field O:Z

.field P:Z

.field Q:I

.field R:Landroid/view/ViewGroup;

.field S:Landroid/view/View;

.field T:Landroid/view/View;

.field U:Z

.field V:Z

.field W:Landroid/support/v4/app/ai;

.field X:Z

.field Y:Z

.field private b:Landroid/view/LayoutInflater;

.field j:I

.field k:Landroid/view/View;

.field l:I

.field m:Landroid/os/Bundle;

.field n:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field o:I

.field p:I

.field q:Ljava/lang/String;

.field r:Landroid/os/Bundle;

.field s:Landroid/support/v4/app/Fragment;

.field t:I

.field u:I

.field v:Z

.field w:Z

.field x:Z

.field y:Z

.field z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 161
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroid/support/v4/app/Fragment;->a:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, -0x1

    .line 372
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 171
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/app/Fragment;->j:I

    .line 187
    iput v1, p0, Landroid/support/v4/app/Fragment;->o:I

    .line 203
    iput v1, p0, Landroid/support/v4/app/Fragment;->t:I

    .line 274
    iput-boolean v2, p0, Landroid/support/v4/app/Fragment;->O:Z

    .line 296
    iput-boolean v2, p0, Landroid/support/v4/app/Fragment;->V:Z

    .line 373
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 380
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/support/v4/app/Fragment;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;
    .locals 4

    .prologue
    .line 399
    :try_start_0
    sget-object v0, Landroid/support/v4/app/Fragment;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 400
    if-nez v0, :cond_0

    .line 402
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 403
    sget-object v1, Landroid/support/v4/app/Fragment;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 406
    if-eqz p2, :cond_1

    .line 407
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 408
    iput-object p2, v0, Landroid/support/v4/app/Fragment;->r:Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    .line 410
    :cond_1
    return-object v0

    .line 411
    :catch_0
    move-exception v0

    .line 412
    new-instance v1, Landroid/support/v4/app/g;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to instantiate fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/support/v4/app/g;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 415
    :catch_1
    move-exception v0

    .line 416
    new-instance v1, Landroid/support/v4/app/g;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to instantiate fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/support/v4/app/g;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 419
    :catch_2
    move-exception v0

    .line 420
    new-instance v1, Landroid/support/v4/app/g;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to instantiate fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": make sure class name exists, is public, and has an"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " empty constructor that is public"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/support/v4/app/g;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method


# virtual methods
.method public A()V
    .locals 1

    .prologue
    .line 1131
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1132
    return-void
.end method

.method public B()V
    .locals 1

    .prologue
    .line 1166
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1167
    return-void
.end method

.method public C()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 1200
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1203
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->Y:Z

    if-nez v0, :cond_0

    .line 1204
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->Y:Z

    .line 1205
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    iget-object v1, p0, Landroid/support/v4/app/Fragment;->q:Ljava/lang/String;

    iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->X:Z

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/p;->a(Ljava/lang/String;ZZ)Landroid/support/v4/app/ai;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    .line 1207
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_1

    .line 1208
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    invoke-virtual {v0}, Landroid/support/v4/app/ai;->h()V

    .line 1210
    :cond_1
    return-void
.end method

.method D()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 1219
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v4/app/Fragment;->o:I

    .line 1220
    iput-object v2, p0, Landroid/support/v4/app/Fragment;->q:Ljava/lang/String;

    .line 1221
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->v:Z

    .line 1222
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->w:Z

    .line 1223
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->x:Z

    .line 1224
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->y:Z

    .line 1225
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->z:Z

    .line 1226
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->A:Z

    .line 1227
    iput v1, p0, Landroid/support/v4/app/Fragment;->B:I

    .line 1228
    iput-object v2, p0, Landroid/support/v4/app/Fragment;->C:Landroid/support/v4/app/s;

    .line 1229
    iput-object v2, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    .line 1230
    iput v1, p0, Landroid/support/v4/app/Fragment;->G:I

    .line 1231
    iput v1, p0, Landroid/support/v4/app/Fragment;->H:I

    .line 1232
    iput-object v2, p0, Landroid/support/v4/app/Fragment;->I:Ljava/lang/String;

    .line 1233
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->J:Z

    .line 1234
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->K:Z

    .line 1235
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->M:Z

    .line 1236
    iput-object v2, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    .line 1237
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->X:Z

    .line 1238
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->Y:Z

    .line 1239
    return-void
.end method

.method public E()V
    .locals 0

    .prologue
    .line 1290
    return-void
.end method

.method F()V
    .locals 3

    .prologue
    .line 1488
    new-instance v0, Landroid/support/v4/app/s;

    invoke-direct {v0}, Landroid/support/v4/app/s;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    .line 1489
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    iget-object v1, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    new-instance v2, Landroid/support/v4/app/f;

    invoke-direct {v2, p0}, Landroid/support/v4/app/f;-><init>(Landroid/support/v4/app/Fragment;)V

    invoke-virtual {v0, v1, v2, p0}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/p;Landroid/support/v4/app/o;Landroid/support/v4/app/Fragment;)V

    .line 1498
    return-void
.end method

.method G()V
    .locals 3

    .prologue
    .line 1546
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1547
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->l()V

    .line 1548
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->h()Z

    .line 1550
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1551
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->f()V

    .line 1552
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    if-nez v0, :cond_1

    .line 1553
    new-instance v0, Landroid/support/v4/app/ba;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onStart()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/ba;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1556
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_2

    .line 1557
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->o()V

    .line 1559
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_3

    .line 1560
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    invoke-virtual {v0}, Landroid/support/v4/app/ai;->g()V

    .line 1562
    :cond_3
    return-void
.end method

.method H()V
    .locals 3

    .prologue
    .line 1565
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1566
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->l()V

    .line 1567
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->h()Z

    .line 1569
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1570
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->A()V

    .line 1571
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    if-nez v0, :cond_1

    .line 1572
    new-instance v0, Landroid/support/v4/app/ba;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onResume()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/ba;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1575
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_2

    .line 1576
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->p()V

    .line 1577
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->h()Z

    .line 1579
    :cond_2
    return-void
.end method

.method I()V
    .locals 1

    .prologue
    .line 1589
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->onLowMemory()V

    .line 1590
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1591
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->v()V

    .line 1593
    :cond_0
    return-void
.end method

.method J()V
    .locals 3

    .prologue
    .line 1684
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1685
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->q()V

    .line 1687
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1688
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->B()V

    .line 1689
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    if-nez v0, :cond_1

    .line 1690
    new-instance v0, Landroid/support/v4/app/ba;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onPause()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/ba;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1693
    :cond_1
    return-void
.end method

.method K()V
    .locals 3

    .prologue
    .line 1696
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1697
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->r()V

    .line 1699
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1700
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->g()V

    .line 1701
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    if-nez v0, :cond_1

    .line 1702
    new-instance v0, Landroid/support/v4/app/ba;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onStop()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/ba;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1705
    :cond_1
    return-void
.end method

.method L()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1708
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1709
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->s()V

    .line 1711
    :cond_0
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->X:Z

    if-eqz v0, :cond_2

    .line 1712
    iput-boolean v3, p0, Landroid/support/v4/app/Fragment;->X:Z

    .line 1713
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->Y:Z

    if-nez v0, :cond_1

    .line 1714
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->Y:Z

    .line 1715
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    iget-object v1, p0, Landroid/support/v4/app/Fragment;->q:Ljava/lang/String;

    iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->X:Z

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/p;->a(Ljava/lang/String;ZZ)Landroid/support/v4/app/ai;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    .line 1717
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_2

    .line 1718
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->h()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1719
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    invoke-virtual {v0}, Landroid/support/v4/app/ai;->c()V

    .line 1725
    :cond_2
    :goto_0
    return-void

    .line 1721
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    invoke-virtual {v0}, Landroid/support/v4/app/ai;->d()V

    goto :goto_0
.end method

.method M()V
    .locals 3

    .prologue
    .line 1728
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1729
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->t()V

    .line 1731
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1732
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->h()V

    .line 1733
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    if-nez v0, :cond_1

    .line 1734
    new-instance v0, Landroid/support/v4/app/ba;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/ba;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1737
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_2

    .line 1738
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    invoke-virtual {v0}, Landroid/support/v4/app/ai;->f()V

    .line 1740
    :cond_2
    return-void
.end method

.method N()V
    .locals 3

    .prologue
    .line 1743
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1744
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->u()V

    .line 1745
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    .line 1747
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1748
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->C()V

    .line 1749
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    if-nez v0, :cond_1

    .line 1750
    new-instance v0, Landroid/support/v4/app/ba;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDestroy()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/ba;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1753
    :cond_1
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .prologue
    .line 1046
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(IZI)Landroid/view/animation/Animation;
    .locals 1

    .prologue
    .line 1004
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 616
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final varargs a(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 629
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(IILandroid/content/Intent;)V
    .locals 0

    .prologue
    .line 926
    return-void
.end method

.method final a(ILandroid/support/v4/app/Fragment;)V
    .locals 2

    .prologue
    .line 440
    iput p1, p0, Landroid/support/v4/app/Fragment;->o:I

    .line 441
    if-eqz p2, :cond_0

    .line 442
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p2, Landroid/support/v4/app/Fragment;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v4/app/Fragment;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/Fragment;->q:Ljava/lang/String;

    .line 446
    :goto_0
    return-void

    .line 444
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "android:fragment:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Landroid/support/v4/app/Fragment;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/Fragment;->q:Ljava/lang/String;

    goto :goto_0
.end method

.method public a(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 983
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 984
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 991
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 992
    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 894
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    if-nez v0, :cond_0

    .line 895
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not attached to FragmentHost"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 897
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, Landroid/support/v4/app/p;->a(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V

    .line 898
    return-void
.end method

.method public a(Landroid/content/Intent;I)V
    .locals 3

    .prologue
    .line 905
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    if-nez v0, :cond_0

    .line 906
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not attached to FragmentHost"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 908
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    invoke-virtual {v0, p0, p1, p2}, Landroid/support/v4/app/p;->a(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V

    .line 909
    return-void
.end method

.method a(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 1582
    invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1583
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1584
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/s;->a(Landroid/content/res/Configuration;)V

    .line 1586
    :cond_0
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 1022
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1023
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 0

    .prologue
    .line 998
    return-void
.end method

.method public a(Landroid/view/Menu;)V
    .locals 0

    .prologue
    .line 1280
    return-void
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    .prologue
    .line 1263
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1356
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    .line 1357
    return-void
.end method

.method public a(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 1060
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1401
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1402
    iget v0, p0, Landroid/support/v4/app/Fragment;->G:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1403
    const-string v0, " mContainerId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1404
    iget v0, p0, Landroid/support/v4/app/Fragment;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1405
    const-string v0, " mTag="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/Fragment;->I:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1406
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/app/Fragment;->j:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 1407
    const-string v0, " mIndex="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/app/Fragment;->o:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 1408
    const-string v0, " mWho="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/Fragment;->q:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1409
    const-string v0, " mBackStackNesting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/app/Fragment;->B:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 1410
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->v:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1411
    const-string v0, " mRemoving="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->w:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1412
    const-string v0, " mResumed="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->x:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1413
    const-string v0, " mFromLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->y:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1414
    const-string v0, " mInLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->z:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 1415
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->J:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1416
    const-string v0, " mDetached="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->K:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1417
    const-string v0, " mMenuVisible="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->O:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1418
    const-string v0, " mHasMenu="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->N:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 1419
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetainInstance="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->L:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1420
    const-string v0, " mRetaining="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->M:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 1421
    const-string v0, " mUserVisibleHint="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->V:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 1422
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->C:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1423
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentManager="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1424
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->C:Landroid/support/v4/app/s;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1426
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    if-eqz v0, :cond_1

    .line 1427
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mActivity="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1428
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1430
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->F:Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_2

    .line 1431
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mParentFragment="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1432
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->F:Landroid/support/v4/app/Fragment;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1434
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->r:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    .line 1435
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mArguments="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/Fragment;->r:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1437
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    .line 1438
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedFragmentState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1439
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1441
    :cond_4
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    if-eqz v0, :cond_5

    .line 1442
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1443
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1445
    :cond_5
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_6

    .line 1446
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTarget="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 1447
    const-string v0, " mTargetRequestCode="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1448
    iget v0, p0, Landroid/support/v4/app/Fragment;->u:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 1450
    :cond_6
    iget v0, p0, Landroid/support/v4/app/Fragment;->Q:I

    if-eqz v0, :cond_7

    .line 1451
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mNextAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/app/Fragment;->Q:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 1453
    :cond_7
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->R:Landroid/view/ViewGroup;

    if-eqz v0, :cond_8

    .line 1454
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/Fragment;->R:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1456
    :cond_8
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    if-eqz v0, :cond_9

    .line 1457
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1459
    :cond_9
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->T:Landroid/view/View;

    if-eqz v0, :cond_a

    .line 1460
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mInnerView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1462
    :cond_a
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->k:Landroid/view/View;

    if-eqz v0, :cond_b

    .line 1463
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAnimatingAway="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/Fragment;->k:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1464
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mStateAfterAnimating="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1465
    iget v0, p0, Landroid/support/v4/app/Fragment;->l:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    .line 1467
    :cond_b
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_c

    .line 1468
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loader Manager:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1469
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/app/ai;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 1471
    :cond_c
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_d

    .line 1472
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Child "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1473
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/support/v4/app/s;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 1475
    :cond_d
    return-void
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 1311
    const/4 v0, 0x0

    return v0
.end method

.method public b(I)I
    .locals 1

    .prologue
    .line 680
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 681
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/s;->b(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v4/app/Fragment;->p:I

    .line 685
    :goto_0
    iget v0, p0, Landroid/support/v4/app/Fragment;->p:I

    return v0

    .line 683
    :cond_0
    add-int/lit8 v0, p1, 0x1

    iput v0, p0, Landroid/support/v4/app/Fragment;->p:I

    goto :goto_0
.end method

.method public b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 2

    .prologue
    .line 934
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->b:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    .line 935
    new-instance v0, Landroid/support/v4/app/e;

    iget-object v1, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    invoke-virtual {v1}, Landroid/support/v4/app/p;->e()Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/support/v4/app/e;-><init>(Landroid/view/LayoutInflater;Landroid/support/v4/app/Fragment;)V

    iput-object v0, p0, Landroid/support/v4/app/Fragment;->b:Landroid/view/LayoutInflater;

    .line 937
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->b:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .prologue
    .line 1524
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1525
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->l()V

    .line 1527
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/view/Menu;)V
    .locals 0

    .prologue
    .line 1322
    return-void
.end method

.method b(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 2

    .prologue
    .line 1605
    const/4 v0, 0x0

    .line 1606
    iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->J:Z

    if-nez v1, :cond_1

    .line 1607
    iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->N:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->O:Z

    if-eqz v1, :cond_0

    .line 1608
    const/4 v0, 0x1

    .line 1609
    invoke-virtual {p0, p1, p2}, Landroid/support/v4/app/Fragment;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 1611
    :cond_0
    iget-object v1, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v1, :cond_1

    .line 1612
    iget-object v1, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v1, p1, p2}, Landroid/support/v4/app/s;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 1615
    :cond_1
    return v0
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 1388
    const/4 v0, 0x0

    return v0
.end method

.method public c(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 695
    iget v0, p0, Landroid/support/v4/app/Fragment;->p:I

    if-ne v0, p1, :cond_0

    .line 701
    :goto_0
    return-object p0

    .line 698
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_1

    .line 699
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/s;->c(I)Landroid/support/v4/app/Fragment;

    move-result-object p0

    goto :goto_0

    .line 701
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method

.method public c(Z)V
    .locals 0

    .prologue
    .line 777
    return-void
.end method

.method c(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 1619
    const/4 v0, 0x0

    .line 1620
    iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->J:Z

    if-nez v1, :cond_1

    .line 1621
    iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->N:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->O:Z

    if-eqz v1, :cond_0

    .line 1622
    const/4 v0, 0x1

    .line 1623
    invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/view/Menu;)V

    .line 1625
    :cond_0
    iget-object v1, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v1, :cond_1

    .line 1626
    iget-object v1, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v1, p1}, Landroid/support/v4/app/s;->a(Landroid/view/Menu;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 1629
    :cond_1
    return v0
.end method

.method c(Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1633
    iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->J:Z

    if-nez v1, :cond_2

    .line 1634
    iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->N:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->O:Z

    if-eqz v1, :cond_1

    .line 1635
    invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/view/MenuItem;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1645
    :cond_0
    :goto_0
    return v0

    .line 1639
    :cond_1
    iget-object v1, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v1, :cond_2

    .line 1640
    iget-object v1, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v1, p1}, Landroid/support/v4/app/s;->a(Landroid/view/MenuItem;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1645
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 1086
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1087
    return-void
.end method

.method d(Landroid/view/Menu;)V
    .locals 1

    .prologue
    .line 1663
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->J:Z

    if-nez v0, :cond_1

    .line 1664
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->N:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->O:Z

    if-eqz v0, :cond_0

    .line 1665
    invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->b(Landroid/view/Menu;)V

    .line 1667
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_1

    .line 1668
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/s;->b(Landroid/view/Menu;)V

    .line 1671
    :cond_1
    return-void
.end method

.method public d(Z)V
    .locals 1

    .prologue
    .line 819
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->N:Z

    if-eq v0, p1, :cond_0

    .line 820
    iput-boolean p1, p0, Landroid/support/v4/app/Fragment;->N:Z

    .line 821
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->w()Z

    move-result v0

    if-nez v0, :cond_0

    .line 822
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->j()V

    .line 825
    :cond_0
    return-void
.end method

.method d(Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1649
    iget-boolean v1, p0, Landroid/support/v4/app/Fragment;->J:Z

    if-nez v1, :cond_2

    .line 1650
    invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->b(Landroid/view/MenuItem;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1659
    :cond_0
    :goto_0
    return v0

    .line 1653
    :cond_1
    iget-object v1, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v1, :cond_2

    .line 1654
    iget-object v1, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v1, p1}, Landroid/support/v4/app/s;->b(Landroid/view/MenuItem;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1659
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()V
    .locals 1

    .prologue
    .line 1246
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1247
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 1154
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 456
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 1110
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1112
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->X:Z

    if-nez v0, :cond_1

    .line 1113
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->X:Z

    .line 1114
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->Y:Z

    if-nez v0, :cond_0

    .line 1115
    iput-boolean v1, p0, Landroid/support/v4/app/Fragment;->Y:Z

    .line 1116
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    iget-object v1, p0, Landroid/support/v4/app/Fragment;->q:Ljava/lang/String;

    iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->X:Z

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/p;->a(Ljava/lang/String;ZZ)Landroid/support/v4/app/ai;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    .line 1118
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_1

    .line 1119
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    invoke-virtual {v0}, Landroid/support/v4/app/ai;->b()V

    .line 1122
    :cond_1
    return-void
.end method

.method final f(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 427
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    .line 428
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->T:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 429
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    .line 431
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 432
    invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->h(Landroid/os/Bundle;)V

    .line 433
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    if-nez v0, :cond_1

    .line 434
    new-instance v0, Landroid/support/v4/app/ba;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/ba;-><init>(Ljava/lang/String;)V

    throw v0

    .line 437
    :cond_1
    return-void
.end method

.method public g()V
    .locals 1

    .prologue
    .line 1175
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1176
    return-void
.end method

.method public g(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 510
    iget v0, p0, Landroid/support/v4/app/Fragment;->o:I

    if-ltz v0, :cond_0

    .line 511
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment already active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 513
    :cond_0
    iput-object p1, p0, Landroid/support/v4/app/Fragment;->r:Landroid/os/Bundle;

    .line 514
    return-void
.end method

.method public h()V
    .locals 1

    .prologue
    .line 1192
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1193
    return-void
.end method

.method public h(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 1101
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1102
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 463
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method i(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 1501
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1502
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->l()V

    .line 1504
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1505
    invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/os/Bundle;)V

    .line 1506
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    if-nez v0, :cond_1

    .line 1507
    new-instance v0, Landroid/support/v4/app/ba;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onCreate()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/ba;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1510
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-nez v0, :cond_2

    .line 1511
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->F()V

    .line 1513
    :cond_2
    if-eqz p1, :cond_3

    .line 1514
    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    .line 1515
    if-eqz v0, :cond_3

    .line 1516
    iget-object v1, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/s;->a(Landroid/os/Parcelable;Ljava/util/ArrayList;)V

    .line 1519
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->m()V

    .line 1520
    return-void
.end method

.method final i()Z
    .locals 1

    .prologue
    .line 449
    iget v0, p0, Landroid/support/v4/app/Fragment;->B:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final j()I
    .locals 1

    .prologue
    .line 492
    iget v0, p0, Landroid/support/v4/app/Fragment;->G:I

    return v0
.end method

.method j(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 1531
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1532
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->l()V

    .line 1534
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1535
    invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->d(Landroid/os/Bundle;)V

    .line 1536
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    if-nez v0, :cond_1

    .line 1537
    new-instance v0, Landroid/support/v4/app/ba;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onActivityCreated()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/ba;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1540
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_2

    .line 1541
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->n()V

    .line 1543
    :cond_2
    return-void
.end method

.method public final k()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 521
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->r:Landroid/os/Bundle;

    return-object v0
.end method

.method k(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 1674
    invoke-virtual {p0, p1}, Landroid/support/v4/app/Fragment;->e(Landroid/os/Bundle;)V

    .line 1675
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-eqz v0, :cond_0

    .line 1676
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->k()Landroid/os/Parcelable;

    move-result-object v0

    .line 1677
    if-eqz v0, :cond_0

    .line 1678
    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1681
    :cond_0
    return-void
.end method

.method public final l()Landroid/support/v4/app/i;
    .locals 2

    .prologue
    .line 574
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->n()Landroid/content/Context;

    move-result-object v0

    .line 575
    if-eqz v0, :cond_0

    instance-of v1, v0, Landroid/support/v4/app/i;

    if-nez v1, :cond_0

    .line 576
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment is not hosted in an activity"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 578
    :cond_0
    check-cast v0, Landroid/support/v4/app/i;

    return-object v0
.end method

.method public final m()Landroid/support/v4/app/p;
    .locals 1

    .prologue
    .line 582
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    return-object v0
.end method

.method public final n()Landroid/content/Context;
    .locals 1

    .prologue
    .line 586
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->a()Landroid/content/Context;

    move-result-object v0

    goto :goto_0
.end method

.method public final o()Landroid/content/res/Resources;
    .locals 3

    .prologue
    .line 593
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    if-nez v0, :cond_0

    .line 594
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not attached to FragmentHost"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 596
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->d()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 1157
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1158
    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .prologue
    .line 1342
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->m()Landroid/support/v4/app/p;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/p;->a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 1343
    return-void
.end method

.method public onLowMemory()V
    .locals 1

    .prologue
    .line 1179
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/Fragment;->P:Z

    .line 1180
    return-void
.end method

.method public final p()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 643
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->C:Landroid/support/v4/app/s;

    return-object v0
.end method

.method public final q()Landroid/support/v4/app/q;
    .locals 2

    .prologue
    .line 651
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    if-nez v0, :cond_0

    .line 652
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->F()V

    .line 653
    iget v0, p0, Landroid/support/v4/app/Fragment;->j:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_1

    .line 654
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->p()V

    .line 663
    :cond_0
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    return-object v0

    .line 655
    :cond_1
    iget v0, p0, Landroid/support/v4/app/Fragment;->j:I

    const/4 v1, 0x4

    if-lt v0, v1, :cond_2

    .line 656
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->o()V

    goto :goto_0

    .line 657
    :cond_2
    iget v0, p0, Landroid/support/v4/app/Fragment;->j:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_3

    .line 658
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->n()V

    goto :goto_0

    .line 659
    :cond_3
    iget v0, p0, Landroid/support/v4/app/Fragment;->j:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 660
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    invoke-virtual {v0}, Landroid/support/v4/app/s;->m()V

    goto :goto_0
.end method

.method public final r()Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 671
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->F:Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method public final s()Z
    .locals 1

    .prologue
    .line 708
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->v:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final t()Z
    .locals 1

    .prologue
    .line 717
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->K:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 468
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 469
    invoke-static {p0, v0}, Landroid/support/v4/c/a;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 470
    iget v1, p0, Landroid/support/v4/app/Fragment;->o:I

    if-ltz v1, :cond_0

    .line 471
    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    iget v1, p0, Landroid/support/v4/app/Fragment;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 474
    :cond_0
    iget v1, p0, Landroid/support/v4/app/Fragment;->G:I

    if-eqz v1, :cond_1

    .line 475
    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    iget v1, p0, Landroid/support/v4/app/Fragment;->G:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    :cond_1
    iget-object v1, p0, Landroid/support/v4/app/Fragment;->I:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 479
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    iget-object v1, p0, Landroid/support/v4/app/Fragment;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    :cond_2
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 483
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Z
    .locals 1

    .prologue
    .line 745
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->x:Z

    return v0
.end method

.method public final v()Z
    .locals 1

    .prologue
    .line 754
    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/app/Fragment;->w()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final w()Z
    .locals 1

    .prologue
    .line 766
    iget-boolean v0, p0, Landroid/support/v4/app/Fragment;->J:Z

    return v0
.end method

.method public x()V
    .locals 1

    .prologue
    .line 806
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    if-eqz v0, :cond_0

    .line 807
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->j()V

    .line 809
    :cond_0
    return-void
.end method

.method public y()Landroid/support/v4/app/ag;
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 878
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_0

    .line 879
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    .line 886
    :goto_0
    return-object v0

    .line 881
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    if-nez v0, :cond_1

    .line 882
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not attached to FragmentHost"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 884
    :cond_1
    iput-boolean v3, p0, Landroid/support/v4/app/Fragment;->Y:Z

    .line 885
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    iget-object v1, p0, Landroid/support/v4/app/Fragment;->q:Ljava/lang/String;

    iget-boolean v2, p0, Landroid/support/v4/app/Fragment;->X:Z

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/p;->a(Ljava/lang/String;ZZ)Landroid/support/v4/app/ai;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    .line 886
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    goto :goto_0
.end method

.method public z()Landroid/view/View;
    .locals 1

    .prologue
    .line 1069
    iget-object v0, p0, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    return-object v0
.end method

.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/malware/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 1

    .prologue
    .line 2383
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2384
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$a;->a:Ljava/lang/ref/WeakReference;

    .line 2385
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 2389
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    .line 2390
    if-eqz v0, :cond_0

    .line 2391
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)V

    .line 2393
    :cond_0
    return-void
.end method

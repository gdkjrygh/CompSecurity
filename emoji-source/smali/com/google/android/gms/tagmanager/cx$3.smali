.class Lcom/google/android/gms/tagmanager/cx$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/cx;->cq()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ahV:Lcom/google/android/gms/tagmanager/cx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/cx;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cx$3;->ahV:Lcom/google/android/gms/tagmanager/cx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cx$3;->ahV:Lcom/google/android/gms/tagmanager/cx;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cx;->e(Lcom/google/android/gms/tagmanager/cx;)Lcom/google/android/gms/tagmanager/at;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/at;->cq()V

    return-void
.end method

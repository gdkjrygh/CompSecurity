.class Lcom/google/android/gms/tagmanager/cp$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/cp;->b(Lcom/google/android/gms/internal/le$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic agV:Lcom/google/android/gms/tagmanager/cp;

.field final synthetic agW:Lcom/google/android/gms/internal/le$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/cp;Lcom/google/android/gms/internal/le$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cp$2;->agV:Lcom/google/android/gms/tagmanager/cp;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/cp$2;->agW:Lcom/google/android/gms/internal/le$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cp$2;->agV:Lcom/google/android/gms/tagmanager/cp;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cp$2;->agW:Lcom/google/android/gms/internal/le$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/cp;->c(Lcom/google/android/gms/internal/le$a;)Z

    return-void
.end method

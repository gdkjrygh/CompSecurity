.class final Lcom/google/android/gms/tagmanager/au;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/google/android/gms/tagmanager/ai;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/ai",
            "<",
            "Lcom/google/android/gms/internal/g;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/google/android/gms/internal/g;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tagmanager/ai;Lcom/google/android/gms/internal/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tagmanager/ai",
            "<",
            "Lcom/google/android/gms/internal/g;",
            ">;",
            "Lcom/google/android/gms/internal/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/au;->a:Lcom/google/android/gms/tagmanager/ai;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/au;->b:Lcom/google/android/gms/internal/g;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tagmanager/ai;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tagmanager/ai",
            "<",
            "Lcom/google/android/gms/internal/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/au;->a:Lcom/google/android/gms/tagmanager/ai;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/g;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/au;->b:Lcom/google/android/gms/internal/g;

    return-object v0
.end method

.class Lcom/google/android/gms/internal/cr$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/cr;->S()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ig:Lcom/google/android/gms/internal/bf;

.field final synthetic ih:Lcom/google/android/gms/internal/cr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/cr;Lcom/google/android/gms/internal/bf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/cr$1;->ih:Lcom/google/android/gms/internal/cr;

    iput-object p2, p0, Lcom/google/android/gms/internal/cr$1;->ig:Lcom/google/android/gms/internal/bf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cr$1;->ig:Lcom/google/android/gms/internal/bf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bf;->S()V

    return-void
.end method

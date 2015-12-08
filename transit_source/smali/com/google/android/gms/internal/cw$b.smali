.class final Lcom/google/android/gms/internal/cw$b;
.super Lcom/google/android/gms/internal/de$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/cw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/cy;",
        ">.b<",
        "Lcom/google/android/gms/appstate/OnStateDeletedListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic iB:Lcom/google/android/gms/internal/cw;

.field private final iC:I

.field private final iD:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnStateDeletedListener;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/cw$b;->iB:Lcom/google/android/gms/internal/cw;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/de$b;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;)V

    iput p3, p0, Lcom/google/android/gms/internal/cw$b;->iC:I

    iput p4, p0, Lcom/google/android/gms/internal/cw$b;->iD:I

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/appstate/OnStateDeletedListener;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/cw$b;->iC:I

    iget v1, p0, Lcom/google/android/gms/internal/cw$b;->iD:I

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/appstate/OnStateDeletedListener;->onStateDeleted(II)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/appstate/OnStateDeletedListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/cw$b;->a(Lcom/google/android/gms/appstate/OnStateDeletedListener;)V

    return-void
.end method

.method protected aF()V
    .locals 0

    return-void
.end method

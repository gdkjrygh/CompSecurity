.class public abstract Lcom/google/android/gms/internal/de$c;
.super Lcom/google/android/gms/internal/de$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/de;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T",
        "Listener:Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/de",
        "<TT;>.b<TT",
        "Listener;",
        ">;"
    }
.end annotation


# instance fields
.field private final jf:Lcom/google/android/gms/common/data/d;

.field final synthetic kP:Lcom/google/android/gms/internal/de;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT",
            "Listener;",
            "Lcom/google/android/gms/common/data/d;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/de$c;->kP:Lcom/google/android/gms/internal/de;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/de$b;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/de$c;->jf:Lcom/google/android/gms/common/data/d;

    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT",
            "Listener;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/de$c;->jf:Lcom/google/android/gms/common/data/d;

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/de$c;->a(Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V

    return-void
.end method

.method protected abstract a(Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT",
            "Listener;",
            "Lcom/google/android/gms/common/data/d;",
            ")V"
        }
    .end annotation
.end method

.method protected aF()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/de$c;->jf:Lcom/google/android/gms/common/data/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/de$c;->jf:Lcom/google/android/gms/common/data/d;

    invoke-virtual {v0}, Lcom/google/android/gms/common/data/d;->close()V

    :cond_0
    return-void
.end method

.method public bridge synthetic be()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/de$b;->be()V

    return-void
.end method

.method public bridge synthetic bf()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/de$b;->bf()V

    return-void
.end method

.method public bridge synthetic unregister()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/internal/de$b;->unregister()V

    return-void
.end method

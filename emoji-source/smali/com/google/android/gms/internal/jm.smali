.class public final Lcom/google/android/gms/internal/jm;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/jn;


# instance fields
.field final Wc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/js;",
            ">;"
        }
    .end annotation
.end field

.field private final Wd:Ljava/lang/String;

.field private final We:Z

.field final Wf:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/jw;",
            ">;"
        }
    .end annotation
.end field

.field private final Wg:Ljava/lang/String;

.field final Wh:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final Wi:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/js;",
            ">;"
        }
    .end annotation
.end field

.field private final Wj:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/jw;",
            ">;"
        }
    .end annotation
.end field

.field private final Wk:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final xM:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/jn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/jm;->CREATOR:Lcom/google/android/gms/internal/jn;

    return-void
.end method

.method constructor <init>(ILjava/util/List;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/js;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/jw;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/jm;->xM:I

    if-nez p2, :cond_2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/jm;->Wc:Ljava/util/List;

    if-nez p3, :cond_0

    const-string p3, ""

    :cond_0
    iput-object p3, p0, Lcom/google/android/gms/internal/jm;->Wd:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/jm;->We:Z

    if-nez p5, :cond_3

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/internal/jm;->Wf:Ljava/util/List;

    if-nez p6, :cond_1

    const-string p6, ""

    :cond_1
    iput-object p6, p0, Lcom/google/android/gms/internal/jm;->Wg:Ljava/lang/String;

    if-nez p7, :cond_4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lcom/google/android/gms/internal/jm;->Wh:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->Wc:Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/jm;->c(Ljava/util/List;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/jm;->Wi:Ljava/util/Set;

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->Wf:Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/jm;->c(Ljava/util/List;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/jm;->Wj:Ljava/util/Set;

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->Wh:Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/jm;->c(Ljava/util/List;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/jm;->Wk:Ljava/util/Set;

    return-void

    :cond_2
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-static {p7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_2
.end method

.method private static c(Ljava/util/List;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<TE;>;)",
            "Ljava/util/Set",
            "<TE;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/jm;->CREATOR:Lcom/google/android/gms/internal/jn;

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "object"    # Ljava/lang/Object;

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    .end local p1    # "object":Ljava/lang/Object;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "object":Ljava/lang/Object;
    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/internal/jm;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/jm;

    .end local p1    # "object":Ljava/lang/Object;
    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wi:Ljava/util/Set;

    iget-object v3, p1, Lcom/google/android/gms/internal/jm;->Wi:Ljava/util/Set;

    invoke-interface {v2, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Lcom/google/android/gms/internal/jm;->We:Z

    iget-boolean v3, p1, Lcom/google/android/gms/internal/jm;->We:Z

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wg:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/jm;->Wg:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wj:Ljava/util/Set;

    iget-object v3, p1, Lcom/google/android/gms/internal/jm;->Wj:Ljava/util/Set;

    invoke-interface {v2, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wk:Ljava/util/Set;

    iget-object v3, p1, Lcom/google/android/gms/internal/jm;->Wk:Ljava/util/Set;

    invoke-interface {v2, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wi:Ljava/util/Set;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/jm;->We:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wj:Ljava/util/Set;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wg:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wk:Ljava/util/Set;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/hk;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public jg()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->Wd:Ljava/lang/String;

    return-object v0
.end method

.method public jh()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/jm;->We:Z

    return v0
.end method

.method public ji()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->Wg:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/hk;->e(Ljava/lang/Object;)Lcom/google/android/gms/internal/hk$a;

    move-result-object v0

    const-string v1, "types"

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wi:Ljava/util/Set;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/hk$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/hk$a;

    move-result-object v0

    const-string v1, "placeIds"

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wk:Ljava/util/Set;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/hk$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/hk$a;

    move-result-object v0

    const-string v1, "requireOpenNow"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/jm;->We:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/hk$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/hk$a;

    move-result-object v0

    const-string v1, "userAccountName"

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wg:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/hk$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/hk$a;

    move-result-object v0

    const-string v1, "requestedUserDataTypes"

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->Wj:Ljava/util/Set;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/hk$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/hk$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hk$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/jm;->CREATOR:Lcom/google/android/gms/internal/jn;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jn;->a(Lcom/google/android/gms/internal/jm;Landroid/os/Parcel;I)V

    return-void
.end method

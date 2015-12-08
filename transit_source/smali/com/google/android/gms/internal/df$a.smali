.class final Lcom/google/android/gms/internal/df$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/df;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/df$a$a;
    }
.end annotation


# instance fields
.field private final kY:Ljava/lang/String;

.field private final kZ:Lcom/google/android/gms/internal/df$a$a;

.field private final la:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/de",
            "<*>.e;>;"
        }
    .end annotation
.end field

.field private lb:Z

.field private lc:Landroid/os/IBinder;

.field private ld:Landroid/content/ComponentName;

.field final synthetic le:Lcom/google/android/gms/internal/df;

.field private mState:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/df;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/df$a;->le:Lcom/google/android/gms/internal/df;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/df$a;->kY:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/df$a$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/df$a$a;-><init>(Lcom/google/android/gms/internal/df$a;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/df$a;->kZ:Lcom/google/android/gms/internal/df$a$a;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/df$a;->la:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/df$a;->mState:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/df$a;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/df$a;->mState:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/df$a;Landroid/content/ComponentName;)Landroid/content/ComponentName;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/df$a;->ld:Landroid/content/ComponentName;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/df$a;Landroid/os/IBinder;)Landroid/os/IBinder;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/df$a;->lc:Landroid/os/IBinder;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/df$a;)Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/df$a;->la:Ljava/util/HashSet;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/de$e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/de",
            "<*>.e;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/df$a;->la:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/de$e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/de",
            "<*>.e;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/df$a;->la:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public bg()Lcom/google/android/gms/internal/df$a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/df$a;->kZ:Lcom/google/android/gms/internal/df$a$a;

    return-object v0
.end method

.method public bh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/df$a;->kY:Ljava/lang/String;

    return-object v0
.end method

.method public bi()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/df$a;->la:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public c(Lcom/google/android/gms/internal/de$e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/de",
            "<*>.e;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/df$a;->la:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getBinder()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/df$a;->lc:Landroid/os/IBinder;

    return-object v0
.end method

.method public getComponentName()Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/df$a;->ld:Landroid/content/ComponentName;

    return-object v0
.end method

.method public getState()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/df$a;->mState:I

    return v0
.end method

.method public isBound()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/df$a;->lb:Z

    return v0
.end method

.method public l(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/df$a;->lb:Z

    return-void
.end method

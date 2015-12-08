.class public final Lcom/google/android/gms/internal/ll;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/widget/ViewSwitcher;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/content/Context;

.field public final d:Lcom/google/android/gms/internal/kz;

.field public final e:Lcom/google/android/gms/internal/db;

.field public f:Lcom/google/android/gms/internal/d;

.field public g:Lcom/google/android/gms/internal/dv;

.field public h:Lcom/google/android/gms/internal/ab;

.field public i:Lcom/google/android/gms/internal/do;

.field public j:Lcom/google/android/gms/internal/dp;

.field public k:Lcom/google/android/gms/internal/m;

.field public l:Lcom/google/android/gms/internal/dt;

.field private m:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ab;Ljava/lang/String;Lcom/google/android/gms/internal/db;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ll;->l:Lcom/google/android/gms/internal/dt;

    iput-object v1, p0, Lcom/google/android/gms/internal/ll;->m:Ljava/util/HashSet;

    iget-boolean v0, p2, Lcom/google/android/gms/internal/ab;->f:Z

    if-eqz v0, :cond_0

    iput-object v1, p0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/internal/ll;->h:Lcom/google/android/gms/internal/ab;

    iput-object p3, p0, Lcom/google/android/gms/internal/ll;->b:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ll;->c:Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/internal/kz;

    iget-object v1, p4, Lcom/google/android/gms/internal/db;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/kr;->a(Ljava/lang/String;Landroid/content/Context;)Lcom/google/android/gms/internal/kr;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/kz;-><init>(Lcom/google/android/gms/internal/iv;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ll;->d:Lcom/google/android/gms/internal/kz;

    iput-object p4, p0, Lcom/google/android/gms/internal/ll;->e:Lcom/google/android/gms/internal/db;

    return-void

    :cond_0
    new-instance v0, Landroid/widget/ViewSwitcher;

    invoke-direct {v0, p1}, Landroid/widget/ViewSwitcher;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    iget-object v0, p0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    iget v1, p2, Lcom/google/android/gms/internal/ab;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewSwitcher;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    iget v1, p2, Lcom/google/android/gms/internal/ab;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewSwitcher;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ll;->a:Landroid/widget/ViewSwitcher;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ViewSwitcher;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ll;->m:Ljava/util/HashSet;

    return-object v0
.end method

.method public final a(Ljava/util/HashSet;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ll;->m:Ljava/util/HashSet;

    return-void
.end method

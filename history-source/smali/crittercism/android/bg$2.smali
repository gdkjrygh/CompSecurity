.class final Lcrittercism/android/bg$2;
.super Lcrittercism/android/di;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcrittercism/android/bg;->b(Lcrittercism/android/az;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcrittercism/android/az;


# direct methods
.method constructor <init>(Lcrittercism/android/az;)V
    .locals 0

    .prologue
    .line 376
    iput-object p1, p0, Lcrittercism/android/bg$2;->a:Lcrittercism/android/az;

    invoke-direct {p0}, Lcrittercism/android/di;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 379
    sget-object v0, Lcrittercism/android/ea;->k:Lcrittercism/android/ea;

    .line 380
    iget-object v0, p0, Lcrittercism/android/bg$2;->a:Lcrittercism/android/az;

    iget-object v0, v0, Lcrittercism/android/az;->o:Lcrittercism/android/br;

    invoke-virtual {v0}, Lcrittercism/android/br;->a()V

    .line 381
    return-void
.end method

.class final Lcrittercism/android/az$9;
.super Lcrittercism/android/di;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcrittercism/android/az;->a(Lcrittercism/android/ch;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcrittercism/android/ch;

.field final synthetic b:Lcrittercism/android/az;


# direct methods
.method constructor <init>(Lcrittercism/android/az;Lcrittercism/android/ch;)V
    .locals 0

    .prologue
    .line 757
    iput-object p1, p0, Lcrittercism/android/az$9;->b:Lcrittercism/android/az;

    iput-object p2, p0, Lcrittercism/android/az$9;->a:Lcrittercism/android/ch;

    invoke-direct {p0}, Lcrittercism/android/di;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 760
    iget-object v0, p0, Lcrittercism/android/az$9;->b:Lcrittercism/android/az;

    iget-object v0, v0, Lcrittercism/android/az;->n:Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az$9;->a:Lcrittercism/android/ch;

    invoke-virtual {v0, v1}, Lcrittercism/android/br;->a(Lcrittercism/android/cg;)Z

    .line 761
    return-void
.end method

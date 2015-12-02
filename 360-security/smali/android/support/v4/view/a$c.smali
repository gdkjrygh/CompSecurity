.class Landroid/support/v4/view/a$c;
.super Landroid/support/v4/view/a$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 214
    invoke-direct {p0}, Landroid/support/v4/view/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/view/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 217
    new-instance v0, Landroid/support/v4/view/a$c$1;

    invoke-direct {v0, p0, p1}, Landroid/support/v4/view/a$c$1;-><init>(Landroid/support/v4/view/a$c;Landroid/support/v4/view/a;)V

    invoke-static {v0}, Landroid/support/v4/view/c;->a(Landroid/support/v4/view/c$a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

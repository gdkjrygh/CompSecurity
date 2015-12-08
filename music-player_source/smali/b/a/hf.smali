.class public final Lb/a/hf;
.super Lb/a/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "serial"

    invoke-direct {p0, v0}, Lb/a/a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    sget-object v0, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

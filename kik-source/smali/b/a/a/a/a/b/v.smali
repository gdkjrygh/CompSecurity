.class final Lb/a/a/a/a/b/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/a/d;


# instance fields
.field final synthetic a:Lb/a/a/a/a/b/u;


# direct methods
.method constructor <init>(Lb/a/a/a/a/b/u;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lb/a/a/a/a/b/v;->a:Lb/a/a/a/a/b/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

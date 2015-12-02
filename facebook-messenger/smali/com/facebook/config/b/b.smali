.class public Lcom/facebook/config/b/b;
.super Ljava/lang/Object;
.source "DefaultAppVersionInfo.java"

# interfaces
.implements Lcom/facebook/config/b/a;


# instance fields
.field private final a:Landroid/content/pm/PackageInfo;


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageInfo;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/facebook/config/b/b;->a:Landroid/content/pm/PackageInfo;

    .line 16
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/facebook/config/b/b;->a:Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 25
    const v0, 0x32506

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x1

    return v0
.end method

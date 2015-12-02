.class final Lcom/facebook/prefs/shared/i;
.super Ljava/lang/Object;
.source "FbSharedPreferencesContract.java"

# interfaces
.implements Landroid/provider/BaseColumns;


# instance fields
.field final a:Landroid/net/Uri;


# direct methods
.method constructor <init>(Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    const-string v0, "prefs"

    invoke-static {p1, v0}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/prefs/shared/i;->a:Landroid/net/Uri;

    .line 77
    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/facebook/prefs/shared/i;->a:Landroid/net/Uri;

    return-object v0
.end method

.class public Lcom/facebook/orca/threadview/cw;
.super Ljava/lang/Object;
.source "ThreadViewMapActivityShim.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 13
    :try_start_0
    const-string v1, "com.google.android.maps.MapActivity"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 15
    :cond_0
    :goto_0
    return v0

    .line 14
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static b()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 21
    :try_start_0
    const-string v0, "com.facebook.orca.threadview.ThreadViewMapActivityImpl"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 23
    :goto_0
    return-object v0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    const/4 v0, 0x0

    goto :goto_0
.end method

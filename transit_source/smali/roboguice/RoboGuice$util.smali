.class public Lroboguice/RoboGuice$util;
.super Ljava/lang/Object;
.source "RoboGuice.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lroboguice/RoboGuice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "util"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static reset()V
    .locals 1

    .prologue
    .line 212
    sget-object v0, Lroboguice/RoboGuice;->injectors:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    .line 213
    sget-object v0, Lroboguice/RoboGuice;->resourceListeners:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    .line 214
    sget-object v0, Lroboguice/RoboGuice;->viewListeners:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    .line 215
    return-void
.end method

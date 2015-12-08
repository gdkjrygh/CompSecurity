.class public final Lcom/roidapp/baselib/c/aj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/roidapp/baselib/c/aj;


# instance fields
.field private final a:Landroid/app/Application;


# direct methods
.method private constructor <init>(Landroid/app/Application;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/roidapp/baselib/c/aj;->a:Landroid/app/Application;

    .line 14
    return-void
.end method

.method public static a()Landroid/app/Application;
    .locals 2

    .prologue
    .line 31
    sget-object v0, Lcom/roidapp/baselib/c/aj;->b:Lcom/roidapp/baselib/c/aj;

    if-nez v0, :cond_0

    .line 32
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "TheApplication not init yet."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_0
    sget-object v0, Lcom/roidapp/baselib/c/aj;->b:Lcom/roidapp/baselib/c/aj;

    iget-object v0, v0, Lcom/roidapp/baselib/c/aj;->a:Landroid/app/Application;

    return-object v0
.end method

.method public static a(Landroid/app/Application;)V
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lcom/roidapp/baselib/c/aj;->b:Lcom/roidapp/baselib/c/aj;

    if-nez v0, :cond_0

    .line 22
    new-instance v0, Lcom/roidapp/baselib/c/aj;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/c/aj;-><init>(Landroid/app/Application;)V

    sput-object v0, Lcom/roidapp/baselib/c/aj;->b:Lcom/roidapp/baselib/c/aj;

    .line 24
    :cond_0
    return-void
.end method

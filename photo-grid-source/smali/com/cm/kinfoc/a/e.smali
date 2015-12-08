.class public abstract Lcom/cm/kinfoc/a/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/cm/kinfoc/a/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const/4 v0, 0x0

    sput-object v0, Lcom/cm/kinfoc/a/e;->a:Lcom/cm/kinfoc/a/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/cm/kinfoc/a/e;
    .locals 2

    .prologue
    .line 15
    sget-object v0, Lcom/cm/kinfoc/a/e;->a:Lcom/cm/kinfoc/a/e;

    if-nez v0, :cond_0

    .line 16
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Virtual Commmon Base is null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18
    :cond_0
    sget-object v0, Lcom/cm/kinfoc/a/e;->a:Lcom/cm/kinfoc/a/e;

    return-object v0
.end method

.method public static a(Lcom/cm/kinfoc/a/e;)V
    .locals 0

    .prologue
    .line 22
    sput-object p0, Lcom/cm/kinfoc/a/e;->a:Lcom/cm/kinfoc/a/e;

    .line 23
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/io/File;)Ljava/lang/String;
.end method

.method public abstract a(Ljava/io/InputStream;)Ljava/lang/String;
.end method

.method public abstract a(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract a(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract b()Landroid/app/Application;
.end method

.method public abstract c()Ljava/io/File;
.end method

.method public abstract d()Z
.end method

.method public abstract e()Z
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()D
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public abstract i()I
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public abstract k()Ljava/lang/String;
.end method

.method public abstract l()Ljava/lang/String;
.end method

.method public abstract m()Ljava/lang/String;
.end method

.method public abstract n()Ljava/lang/String;
.end method

.class public Lorg/bouncycastle/util/test/SimpleTestResult;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/util/test/TestResult;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/util/test/SimpleTestResult;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/util/test/SimpleTestResult;->b:Ljava/lang/String;

    return-object v0
.end method

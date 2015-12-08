.class public final Lcom/c/a/c/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/c/l$a;
    }
.end annotation


# static fields
.field private static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 86
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lcom/c/a/c/l;->a:I

    return-void
.end method

.method public static a()Lcom/c/a/c/j;
    .locals 1

    .prologue
    .line 140
    sget-object v0, Lcom/c/a/c/l$a;->a:Lcom/c/a/c/j;

    return-object v0
.end method

.method public static a(I)Lcom/c/a/c/j;
    .locals 1

    .prologue
    .line 128
    new-instance v0, Lcom/c/a/c/m;

    invoke-direct {v0, p0}, Lcom/c/a/c/m;-><init>(I)V

    return-object v0
.end method

.method static synthetic b()I
    .locals 1

    .prologue
    .line 44
    sget v0, Lcom/c/a/c/l;->a:I

    return v0
.end method

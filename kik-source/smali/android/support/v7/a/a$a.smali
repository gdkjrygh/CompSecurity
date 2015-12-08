.class public final Landroid/support/v7/a/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:[I

.field public static final b:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Landroid/support/v7/a/a$a;->a:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10100c4
        0x7f010017
        0x7f010018
        0x7f010019
        0x7f01001a
    .end array-data
.end method

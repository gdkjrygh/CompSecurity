.class public final Lkik/android/util/af;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lkik/android/util/ag;

    invoke-direct {v0, p0}, Lkik/android/util/ag;-><init>(Lkik/android/util/af;)V

    iput-object v0, p0, Lkik/android/util/af;->a:Ljava/lang/Runnable;

    return-void
.end method

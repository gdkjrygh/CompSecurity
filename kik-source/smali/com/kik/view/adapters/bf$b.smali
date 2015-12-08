.class public Lcom/kik/view/adapters/bf$b;
.super Lcom/kik/view/adapters/s$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/view/adapters/bf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "b"
.end annotation


# instance fields
.field A:Z

.field f:Landroid/view/View;

.field g:Landroid/widget/ImageView;

.field t:Landroid/widget/ImageView;

.field u:Landroid/widget/ImageView;

.field v:Lkik/android/widget/RobotoTextView;

.field w:Lkik/android/widget/ProgressWheel;

.field x:Lcom/kik/view/adapters/ak;

.field y:Landroid/view/ViewGroup;

.field z:Z


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0}, Lcom/kik/view/adapters/s$a;-><init>()V

    .line 99
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/view/adapters/bf$b;->z:Z

    return-void
.end method

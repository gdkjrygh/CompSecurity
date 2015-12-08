.class Lorg/xwalk/core/internal/XWalkViewInternal$3;
.super Ljava/lang/Object;
.source "XWalkViewInternal.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkViewInternal;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkViewInternal;

.field final synthetic val$activity:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 300
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkViewInternal$3;->this$0:Lorg/xwalk/core/internal/XWalkViewInternal;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkViewInternal$3;->val$activity:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 303
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkViewInternal$3;->val$activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 304
    return-void
.end method

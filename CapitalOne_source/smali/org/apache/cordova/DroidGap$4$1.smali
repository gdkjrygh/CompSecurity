.class Lorg/apache/cordova/DroidGap$4$1;
.super Ljava/lang/Object;
.source "DroidGap.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/DroidGap$4;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/apache/cordova/DroidGap$4;


# direct methods
.method constructor <init>(Lorg/apache/cordova/DroidGap$4;)V
    .locals 0

    .prologue
    .line 871
    iput-object p1, p0, Lorg/apache/cordova/DroidGap$4$1;->this$1:Lorg/apache/cordova/DroidGap$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 873
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 874
    iget-object v0, p0, Lorg/apache/cordova/DroidGap$4$1;->this$1:Lorg/apache/cordova/DroidGap$4;

    iget-boolean v0, v0, Lorg/apache/cordova/DroidGap$4;->val$exit:Z

    if-eqz v0, :cond_0

    .line 875
    iget-object v0, p0, Lorg/apache/cordova/DroidGap$4$1;->this$1:Lorg/apache/cordova/DroidGap$4;

    iget-object v0, v0, Lorg/apache/cordova/DroidGap$4;->val$me:Lorg/apache/cordova/DroidGap;

    invoke-virtual {v0}, Lorg/apache/cordova/DroidGap;->endActivity()V

    .line 877
    :cond_0
    return-void
.end method

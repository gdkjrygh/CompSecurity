.class Lyong/powerfull/equalizer/Equize$2;
.super Ljava/lang/Object;
.source "Equize.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyong/powerfull/equalizer/Equize;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lyong/powerfull/equalizer/Equize;


# direct methods
.method constructor <init>(Lyong/powerfull/equalizer/Equize;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lyong/powerfull/equalizer/Equize$2;->this$0:Lyong/powerfull/equalizer/Equize;

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "arg0"    # Landroid/view/View;

    .prologue
    .line 122
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize$2;->this$0:Lyong/powerfull/equalizer/Equize;

    invoke-virtual {v0}, Lyong/powerfull/equalizer/Equize;->onFinish()V

    .line 123
    return-void
.end method

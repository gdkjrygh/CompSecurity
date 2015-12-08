.class final Lcom/roidapp/photogrid/release/on;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/photogrid/release/ol;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ol;I)V
    .locals 0

    .prologue
    .line 866
    iput-object p1, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iput p2, p0, Lcom/roidapp/photogrid/release/on;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x0

    .line 868
    iget-object v0, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;)Z

    move-result v1

    .line 870
    const-wide/16 v2, 0x3e8

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 875
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    const/16 v2, 0xf

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ol;->b(I)V

    .line 876
    iget-object v0, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget v2, p0, Lcom/roidapp/photogrid/release/on;->a:I

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/ol;->a(Lcom/roidapp/photogrid/release/ol;I)[Ljava/lang/String;

    move-result-object v0

    .line 877
    if-eqz v0, :cond_5

    .line 878
    const/4 v2, 0x0

    aget-object v2, v0, v2

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    aget-object v2, v0, v2

    const-string v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 879
    iget-object v2, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    const/4 v3, 0x1

    aget-object v0, v0, v3

    iput-object v0, v2, Lcom/roidapp/photogrid/release/ol;->n:Ljava/lang/String;

    .line 880
    iget-object v0, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->n:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->n:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 881
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 882
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 883
    iget v2, p0, Lcom/roidapp/photogrid/release/on;->a:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 884
    const/4 v2, 0x1

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 885
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 886
    iget-object v2, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    .line 930
    :cond_0
    :goto_1
    return-void

    .line 872
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 888
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    const/16 v2, 0x93

    iput v2, v0, Lcom/roidapp/photogrid/release/ol;->m:I

    .line 889
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 890
    const/4 v2, 0x7

    iput v2, v0, Landroid/os/Message;->what:I

    .line 891
    iget-object v2, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget v2, v2, Lcom/roidapp/photogrid/release/ol;->m:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 892
    iget-object v2, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ol;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 916
    :catch_1
    move-exception v0

    .line 917
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 918
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 919
    iget-object v2, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ol;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v2, :cond_2

    .line 920
    iget-object v2, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ol;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v4, v2, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 922
    :cond_2
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 923
    iput v5, v2, Landroid/os/Message;->what:I

    .line 924
    iget v3, p0, Lcom/roidapp/photogrid/release/on;->a:I

    iput v3, v2, Landroid/os/Message;->arg1:I

    .line 925
    iput v4, v2, Landroid/os/Message;->arg2:I

    .line 926
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 927
    iget-object v1, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 928
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_1

    .line 894
    :cond_3
    const/4 v2, 0x0

    :try_start_3
    aget-object v2, v0, v2

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    aget-object v2, v0, v2

    const-string v3, "1"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 895
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 896
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 897
    iget v2, p0, Lcom/roidapp/photogrid/release/on;->a:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 898
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 899
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 900
    iget-object v2, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_1

    .line 901
    :cond_4
    const/4 v2, 0x0

    aget-object v2, v0, v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    aget-object v0, v0, v2

    const-string v2, "2"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 902
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 903
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 904
    iget v2, p0, Lcom/roidapp/photogrid/release/on;->a:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 905
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 906
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 907
    iget-object v2, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_1

    .line 910
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    const/16 v2, 0x94

    iput v2, v0, Lcom/roidapp/photogrid/release/ol;->m:I

    .line 911
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 912
    const/4 v2, 0x7

    iput v2, v0, Landroid/os/Message;->what:I

    .line 913
    iget-object v2, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget v2, v2, Lcom/roidapp/photogrid/release/ol;->m:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 914
    iget-object v2, p0, Lcom/roidapp/photogrid/release/on;->b:Lcom/roidapp/photogrid/release/ol;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ol;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_1
.end method

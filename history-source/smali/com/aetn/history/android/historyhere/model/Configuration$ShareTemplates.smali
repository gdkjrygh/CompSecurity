.class public Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;
.super Ljava/lang/Object;
.source "Configuration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/Configuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ShareTemplates"
.end annotation


# instance fields
.field public email:Lcom/aetn/history/android/historyhere/model/Configuration$Email;

.field public facebook:Ljava/lang/String;

.field public googleplus:Ljava/lang/String;

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/Configuration;

.field public twitter:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/model/Configuration;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/Configuration;

    .prologue
    .line 49
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;->this$0:Lcom/aetn/history/android/historyhere/model/Configuration;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.class public Lcom/aetn/history/android/historyhere/model/Configuration$Localytics;
.super Ljava/lang/Object;
.source "Configuration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/Configuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Localytics"
.end annotation


# instance fields
.field public dev:Lcom/aetn/history/android/historyhere/model/Configuration$Values;

.field public prod:Lcom/aetn/history/android/historyhere/model/Configuration$Values;

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/Configuration;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/model/Configuration;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/Configuration;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/Configuration$Localytics;->this$0:Lcom/aetn/history/android/historyhere/model/Configuration;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

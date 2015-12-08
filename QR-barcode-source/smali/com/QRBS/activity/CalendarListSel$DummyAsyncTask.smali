.class public Lcom/QRBS/activity/CalendarListSel$DummyAsyncTask;
.super Landroid/os/AsyncTask;
.source "CalendarListSel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/QRBS/activity/CalendarListSel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DummyAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/CalendarListSel;


# direct methods
.method public constructor <init>(Lcom/QRBS/activity/CalendarListSel;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/QRBS/activity/CalendarListSel$DummyAsyncTask;->this$0:Lcom/QRBS/activity/CalendarListSel;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/QRBS/activity/CalendarListSel$DummyAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 1
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 118
    const/4 v0, 0x0

    return-object v0
.end method

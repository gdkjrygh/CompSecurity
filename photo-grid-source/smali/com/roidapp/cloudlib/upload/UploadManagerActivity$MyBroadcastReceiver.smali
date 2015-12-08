.class public Lcom/roidapp/cloudlib/upload/UploadManagerActivity$MyBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V
    .locals 0

    .prologue
    .line 288
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity$MyBroadcastReceiver;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/UploadManagerActivity$MyBroadcastReceiver;->a:Lcom/roidapp/cloudlib/upload/UploadManagerActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/upload/UploadManagerActivity;->b(Lcom/roidapp/cloudlib/upload/UploadManagerActivity;)V

    .line 293
    return-void
.end method

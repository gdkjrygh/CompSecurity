if (window.Stage) {
     Stage.__stage_cmds__ = $__stage_cmds__$;
     Stage.supports = function(c) { return this.__stage_cmds__.indexOf(c) >= 0; }

     Stage.__stage_props__ = new Object();
     Stage.__stage_props__['itunes'] = false;
     Stage.__stage_props__['os'] = 'android';
     Stage.__stage_props__['version'] = '$__version__$';
     Stage.__stage_props__['explicitContentFilterEnabled'] = $__explicitContentFilterEnabled__$;
     Stage.getProperty = function(p) { return this.__stage_props__[p] }
     
     if (Stage.mobileComplete) { Stage.mobileComplete(); }
}
